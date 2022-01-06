package com.hcl.collections;

public class Employee {
	Integer id;
	String name;
	String city;
	String codeName;
	
	public Employee(Integer i, String n, String c, String cn) {
	this.id = i;
	this.name = n;
	this.city =c;
	this.codeName = cn;
	}
	public String outputString() {
	return "Employee ID: " + id + "\nName: " + name + " \nLocation: " + city;
	}
	public String getCodeName() {
	return codeName;
	}

}
