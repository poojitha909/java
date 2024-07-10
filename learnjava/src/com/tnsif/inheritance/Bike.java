package com.tnsif.inheritance;

public class Bike {
    int speed;
    
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int speed) {
		this.speed = speed;
	}
    void decreaseSpeed() {
    	speed = speed - 10; 
    }
    void increaseSpeed() {
    	speed = speed +10;
    }
	@Override
	public String toString() {
		return "Bike [speed=" + speed + "]";
	}
    
}
