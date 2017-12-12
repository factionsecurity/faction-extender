package com.fuse.interfaces;

import java.util.Date;

public abstract class  _FinalReport {
	public abstract Long getId();
	public abstract String getBase64EncodedPdf();
	public abstract void setBase64EncodedPdf(String base64EncodedPdf);
	public abstract Date getGentime();
	public abstract void setGentime(Date gentime);

}
