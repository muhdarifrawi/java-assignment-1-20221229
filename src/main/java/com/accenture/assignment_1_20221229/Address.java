package com.accenture.assignment_1_20221229;

public class Address {
	private String Addr;

	
	public Address(String addr) {
		super();
		this.Addr = addr;
	}


	public String getAddr() {
		return Addr;
	}


	@Override
	public String toString() {
		return "Address [Addr=" + Addr + "]";
	}
	
	
}
