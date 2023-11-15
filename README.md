# faction-extender
Faction has the ability to extend its functionality on the server side. If you are familiar with writing BurpSuite extensions then this process should be somewhat familiar to you. If you are not it’s OK . We will walk through the specifics below.

1. Clone this repo `git clone git@github.com:factionsecurity/faction-extender.git`
1. Create an Eclipse project. The name does not matter.
2. Create a Class. In this case, we will name it `ExtenderStuff.java`
3. In your project right click and select Build Path -> Add External Archives.
4. Select Extender.jar and open. It should now be part of your Eclipse Project.
5. Now Copy the Skeleton Code Below:
```
public class ExtenderStuff implements com.fuse.extender.AssessmentManager{
     @Override
     public Object[] assessmentChange(Assessment arg0, List arg1, Operation arg2) {
            return new Object [] {arg0, arg1};
     }
}
```
Note that above it returns Object [] {arg0, arg1}. This will update Faction’s database if the values change when this function returns. If you Return null it will NOT update Faction and only just send/process  information.

Now we have a basic functional block of code we need to make it perform an action like sending all vulnerabilities to an external vulnerability tracker and then updating Faction with the tracking numbers. Modify the code to look like the following:
```
public class ExtenderStuff implements com.fuse.extender.AssessmentManager{

	@Override
	public Object[] assessmentChange(Assessment arg0, List arg1, Operation arg2) {
		System.out.println(arg0.getAppId()); // print application id
		System.out.println(arg0.getName()); // print application Name
		if(arg2 == Operation.Create) {
			System.out.println("Assessment Created");
		}
		if(arg2 == Operation.Finalize) {
			//Integration into vulnerability management system
			for(Vulnerability v : arg1) {
				//this can update vulns and send the updated values back into Faction
				v= customFunctionToSendVulns(v);
			}
		}
		return new Object [] {arg0, arg1}; // return updated assessment and vulnerability records. 
                // Optionally return null to not update Faction after the process completes
	}
	
	private Vulnerability customFunctionToSendVulns(Vulnerability v) {
		//Pretend this sends to an external service to update the vuln
		UUID uuid = UUID.randomUUID();
		v.setTracking(uuid.toString());
		return v;
	}

}
```
Now check for compile errors, create some unit tests to make sure it works and then export the jar file.

### To import it into Faction
To run it on Faction, at least two files must be added to the server. Extender.jar and MyExtension.jar need to be placed in the `/opt/faction/modules/` folder. Restart Faction and the modules will take effect when certain conditions are triggered.
