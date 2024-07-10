package com.tnsif.finalex;

public class Finaldemo {
	
		final int x =10;
	static final int y;
	static {
		y = 7;
	}
	public static void main(String[] args) {
		Finaldemo d = new Finaldemo();
		System.out.println(d.x);
		System.out.println(d.y);
		
	}
	

}
