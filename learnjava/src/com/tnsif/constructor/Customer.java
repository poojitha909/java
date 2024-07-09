package com.tnsif.constructor;

public class Customer {
	private String ename;
	private int cid;
	private String caddress;


	public Customer(String ename, int cid, String caddress) {
		this.ename = ename;
		this.cid = cid;
		this.caddress = caddress;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Customer [ename=" + ename + ", cid=" + cid + ", caddress=" + caddress + "]";
	}


	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
}
