package com.tnsif.constructor;
import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your num");
		int num = sc.nextInt();
		
		System.out.println("enter your address");
		String address = sc.nextLine();
		
		Customer c = new Customer();
		c.setEname(name);
		c.setCid(num);
		c.setCaddress(address);
			
		
	}

}
