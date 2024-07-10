package com.tnsif.inheritance;

public class Mountainbike extends Bike {
	int gears;

	

	
	
	public Mountainbike(int speed,int gears) {
		super(speed);
		this.gears = gears;
	}
	@Override
	public String toString() {
		return super.toString()+"Mountainbike [gears=" + gears + "]";
	}
	
	

}
