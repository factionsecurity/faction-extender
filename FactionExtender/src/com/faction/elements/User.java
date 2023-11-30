package com.faction.elements;

import java.util.Date;



public class User {
	
	private String fname;
	private String lname;
	private String email;
	private String username;
	private boolean inActive;
	private Date lastLogin;
	private Date loginTime;
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public boolean isInActive() {
		return inActive;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setInActive(boolean inActive) {
		this.inActive = inActive;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	
	

}
