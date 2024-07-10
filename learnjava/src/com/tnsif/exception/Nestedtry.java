package com.tnsif.exception;

public class Nestedtry {
	public static void check() {
		String str = "TNS";
		int slength = str.length();
		System.out.println(slength);
		
		String anotherstr = null;
		int y = 6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(anotherstr.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
