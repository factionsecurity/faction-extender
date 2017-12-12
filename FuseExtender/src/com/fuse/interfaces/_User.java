package com.fuse.interfaces;

import java.util.Date;


public abstract class _User {
	
	public abstract long getId();
	public abstract String getFname();
	public abstract void setFname(String fname);
	public abstract String getLname();
	public abstract void setLname(String lname);
	public abstract String getEmail();
	public abstract void setEmail(String email);
	public abstract String getUsername();
	public abstract void setUsername(String username);
	public abstract _Teams getTeam();
	public abstract void setTeam(_Teams team);
	public abstract boolean isInActive();
	public abstract void setInActive(boolean inActive);
	public abstract int getVerificationCount();
	public abstract void setVerificationCount(int count);
	public abstract Date getLastLogin();
	public abstract void setLastLogin(Date lastLogin);
	public abstract Date getLoginTime();
	public abstract void setLoginTime(Date loginTime);
	public abstract void setAvatarGuid(String avatarGuid);

}
