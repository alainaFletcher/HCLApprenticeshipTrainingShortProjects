package com.hcl.streams;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
	int empID;
	String empName;
	LocalDate dob;
	int age;
	double salary;

	public Employee(int ei, String en, LocalDate d, double s) {
		this.empID = ei;
		this.empName = en;
		this.dob = d;
		this.age = Period.between(d, LocalDate.now()).getYears();
		this.salary = s;
	}

	public String outputString() {
		return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nDate of Birth: " + dob + "\nAge: " + age
				+ "\nSalary: $" + salary + "\n";
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return empName;
	}

}