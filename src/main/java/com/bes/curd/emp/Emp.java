package com.bes.curd.emp;

import org.springframework.stereotype.Component;

public class Emp {
	private String eid;
	private String ename;
	private String address;
	private String contactno;
	
	public Emp(String eid, String ename, String address, String contactno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.contactno = contactno;
	}
	public String getEid() {
		return this.eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
}
