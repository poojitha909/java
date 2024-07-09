package com.tnsif.inheritance;

public class Student extends Citizen {
	private String collegename;
	private int rollno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String collegename,int rollno) {
		this.collegename = collegename;
		this.rollno = rollno;
	}
	public Student(String name, long addhar,long phone) {
		super(name,addhar,phone);
		
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return super.toString()+ "Student [collegename=" + collegename + ", rollno=" + rollno + "]";
	}
	

}
