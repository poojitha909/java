package com.tnsif.constructor;

public class Thisdemo {
	String a;
	float f;
	Thisdemo(String a,float f){
		this.a = a;
		this.f = f;
		System.out.println(a +" "+ f);
	}
	public static void main(String[] args) {
	Thisdemo s = new Thisdemo("p",8);
	

}
}
