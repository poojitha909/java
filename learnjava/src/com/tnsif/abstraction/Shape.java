package com.tnsif.abstraction;

public abstract class Shape {
	protected float area;
	
	abstract void area();
	
	void show() {
		System.out.println("area= "+area);
	}

}
