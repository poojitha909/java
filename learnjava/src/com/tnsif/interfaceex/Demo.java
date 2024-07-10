package com.tnsif.interfaceex;


public class Demo implements Myinterface.Myinnerinterface{
	
	@Override
	public void print() {
		System.out.println("My inner interface");
	}
	public static void main(String[] args) {
		Demo n = new Demo();
		System.out.println(Demo.id);
		n.print();
			
	}

}
