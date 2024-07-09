package com.tnsif.scanner;

public class Taxcal {
	public void calculate(Person p) {
		if(p.getIncome()< 16000) {
			p.setTax(0);
		}
		else {
			p.setTax(5);
		}
	}

}
