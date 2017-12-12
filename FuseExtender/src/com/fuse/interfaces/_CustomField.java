package com.fuse.interfaces;


public abstract class _CustomField {

	public abstract Long getId();
	public abstract _CustomType getType();
	public abstract String getValue();
	public abstract void setType(_CustomType type);
	public abstract void setValue(String value);
}
