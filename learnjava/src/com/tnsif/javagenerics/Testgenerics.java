package com.tnsif.javagenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("poojitha");
		al.add("hello");
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
