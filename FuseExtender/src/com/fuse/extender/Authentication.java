package com.fuse.extender;

public interface Authentication {
	
	public Object preLogin();
	
	public boolean login(String username, String password);
	
	public boolean logout();
	
	public Object authCredentials(String data);

}
