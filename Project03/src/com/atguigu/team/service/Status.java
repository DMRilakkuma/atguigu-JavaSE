package com.atguigu.team.service;
public enum Status {

//	public static final Status FREE = new Status("FREE");
//	public static final Status VOCATION = new Status("VOCATION");
//	public static final Status BUSY = new Status("BUSY");

	FERR("FREE"),
	VOCATION("VOCATION"),
	BUSY("BUSY"), FREE("FREE");

	private final String NAME;
	private Status(String name) {
		this.NAME = name;
	}

	public String getNAME() {
		return NAME;
	}




	@Override
	public String toString() {
		return NAME;
	}
}
