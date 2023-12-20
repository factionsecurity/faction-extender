# faction-extender

> [!IMPORTANT]
> This repo is being archived. Use [this Faction Extender](https://github.com/factionsecurity/FactionExtender) moving forward.

Faction has the ability to extend its functionality on the server side. More information about creating a Faction plugin can be found here: https://www.factionsecurity.com/project/extending-faction/

### To include the Extendar API in your project, add the following sections to your pom.xml

```
<repositories>
  <repository>
    <id>FactionExtender</id>
    <url>https://github.com/factionsecurity/faction-extender/raw/mvn-repo/</url>
    <snapshots>
      <enabled>true</enabled>
      <updatePolicy>always</updatePolicy>
    </snapshots>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>FactionExtender</groupId>
    <artifactId>FactionExtender</artifactId>
    <version>1.1</version>
  </dependency>
</dependencies>

<build>
  <plugins>
    <plugin>
      <artifactId>maven-assembly-plugin</artifactId>
      <configuration>
        <descriptorRefs>
          <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
        <archive> 
          <manifestEntries>
            <Import-Library>org.faction.JiraPlugin</Import-Library>
          </manifestEntries>
        </archive>
      </configuration>
    </plugin>
  </plugins>
</build>
```
