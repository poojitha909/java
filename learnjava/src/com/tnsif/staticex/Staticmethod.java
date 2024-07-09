package com.tnsif.staticex;

public class Staticmethod {
	String name;
	int rollno;
	static String collegename ="sriindu";
	
	static void change() {
		collegename="cvr";
	}
	
	void display(String name,int rollno) {
		System.out.println(name+" "+rollno+" "+collegename);
	}
			
			

}
