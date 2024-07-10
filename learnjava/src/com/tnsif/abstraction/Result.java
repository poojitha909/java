package com.tnsif.abstraction;

public class Result {
	public static void main(String[] args) {
		Shape s = new Square();
		Shape d = new Square(2.4f);
		s.area();
		s.show();
		d.area();
		d.show();
	}

}
