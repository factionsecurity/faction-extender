package com.fuse.elements;


public class CustomType {
	

	private Long id;
	private String key;
	private String variable;
	private int type;
	
	static public enum ObjType { ASMT, VULN, USER, VER };
	public CustomType(){};
	
	public CustomType(String key, String variable, int type){
		this.key = key;
		this.variable = variable;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public String getKey() {
		return key;
	}
	public String getVariable() {
		return variable;
	}
	public int getType() {
		return type;
	}

	public void setKey(String key) {
		this.key = key;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public void setType(int type) {
		this.type = type;
	}

	public String getTypeStr(){
		switch(this.type){
			case 0: return "Assessment";
			case 1: return "Vulnerability";
			case 2: return "User";
			case 3: return "Retest";
			default: return "Undefined";
		}
	}
	
	
	
	
	

}
