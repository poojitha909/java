package com.tnsif.userdefinedexceptions;

import java.util.Scanner;

public class Userdefined {
	private static int age;
	
	static void validate() throws Age{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age > 18)
			throw new Age ("invalid age");
		else
			System.out.println("valid age");
	}
	public static void main(String[] args) {
		try {
			Userdefined.validate();
		}
		catch(Age e) {
			System.out.println(e.getMessage());
		}
	}

}
