package com.tnsif.thread;

public class Implementingrunnable implements Runnable{
	public static void main(String[] args) {
		Implementingrunnable e = new Implementingrunnable();
		
		// e.start();
		Thread t1 = new Thread(e);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("implementing the runnable interface");
		
	}

}
