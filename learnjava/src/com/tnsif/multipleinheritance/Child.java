package com.tnsif.multipleinheritance;

public class Child implements Grandfather,Father {
	@Override
	public void drinking() {
		System.out.println("Drinking cool drink");
	}

}
