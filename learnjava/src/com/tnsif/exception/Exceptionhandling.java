package com.tnsif.exception;

public class Exceptionhandling {
	public static void main(String[] args) {
	int d =0;
	try {
		int a = 55/d;
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}

}
}
