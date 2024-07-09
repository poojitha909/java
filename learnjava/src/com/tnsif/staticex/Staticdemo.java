package com.tnsif.staticex;

public class Staticdemo {
	int id;
	String name;
	static String company = "TNS";
	public Staticdemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	 void display() {
		System.out.println(name +" "+id+" "+company);
	}

}
