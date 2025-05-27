package com.xius.smf.utils;


public class XmlResourceBundleData {

	String id;
	String en;
	String ar;
	
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	public String getAr() {
		return ar;
	}
	public void setAr(String ar) {
		this.ar = ar;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public boolean equals (XmlResourceBundleData x) {
		
		if (this.getId().equals( x.getId() )) {
			return true;
		}
		return false;
	}	
	/*public String toString() {
		return "[id=" + id + 

				", ar=" + ar +
				", en=" + en +
				"]";
	}*/
}
