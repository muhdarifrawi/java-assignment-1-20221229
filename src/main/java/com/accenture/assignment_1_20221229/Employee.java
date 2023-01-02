package com.accenture.assignment_1_20221229;

public class Employee {
	private String name;
	private int id;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	public void employeeInfo() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee address: " + address.getAddr());
	}
}
