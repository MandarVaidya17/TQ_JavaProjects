package com.mapdemo.hashmapdemo;

public class Customer {
	private int cid;
	private String cname;
	private long mobile;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, long mobile) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + "]";
	}
	
	

}
