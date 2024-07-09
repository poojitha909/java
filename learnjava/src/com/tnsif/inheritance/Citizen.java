package com.tnsif.inheritance;

public class Citizen {
	private String name;
	private long addhar;
	private long phone;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name, long addhar, long phone) {
		super();
		this.name = name;
		this.addhar = addhar;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAddhar() {
		return addhar;
	}
	public void setAddhar(long addhar) {
		this.addhar = addhar;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", addhar=" + addhar + ", phone=" + phone + "]";
	}
	

}
