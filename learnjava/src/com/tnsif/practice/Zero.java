package com.tnsif.practice;

import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("number is 0");
		}
		else {
			System.out.println("number is not zero");
		}
	}

}
