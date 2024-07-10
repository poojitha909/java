package com.tnsif.methodoverriding;

public class Result {
	public static void main(String[] args) {
		Child c = new Child();
		c.drinking();
		Father f = new Father();
		f.drinking();
	}

}
