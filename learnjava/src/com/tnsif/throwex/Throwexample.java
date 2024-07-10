package com.tnsif.throwex;
import java.util.Scanner;

public class Throwexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your rollno");
		int rollno = sc.nextInt();
		
		if(rollno<0) {
			throw new ArithmeticException("rollno cannot be access");
		}
		else {
			System.out.println("valid rollno");
		}
		
	}

}
