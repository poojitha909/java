package com.tnsif.scanner;
import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your income");
		int income = sc.nextInt();
		
		
		Person pp = new Person();
		pp.setName(name);
		pp.setIncome(income);
		Taxcal t = new Taxcal();
		t.calculate(pp);
		System.out.println(pp);
	}

}
