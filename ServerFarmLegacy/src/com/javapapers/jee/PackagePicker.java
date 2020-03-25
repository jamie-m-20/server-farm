package com.javapapers.jee;

public class PackagePicker {
	public String pickPackage(String p) {
		String packageType = "";
		if ("Fish".equals(p)) {
			packageType = "Frozen";
		} else if ("Meat".equals(p)) {
			packageType = "Plastic";
		} else {
			packageType = "Box!";
		}
		return packageType;
	}
}
