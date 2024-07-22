package com.tnsif.listinterface;

import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(23);
		al.add(73);
		al.add(1, 10);
		System.out.println(al);
	}

}
