package com.tnsif.userdefinedexceptions;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		Example e = new Example();
		try {
			e.display();
		}
		catch(IOException r) {
			System.out.println(r.getMessage());
		}
	}

}
