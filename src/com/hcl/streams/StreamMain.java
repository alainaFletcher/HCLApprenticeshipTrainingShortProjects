package com.hcl.streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		Employee empA = new Employee(1234, "Alice Barnes", LocalDate.parse("1987-06-30"), 12000.00);
		Employee empB = new Employee(2345, "Bob Caraway", LocalDate.parse("1967-04-22"), 9000.00);
		Employee empC = new Employee(3456, "Cindy Daniels", LocalDate.parse("1954-12-10"), 32000.00);
		Employee empD = new Employee(4567, "Derek Edwards", LocalDate.parse("1999-05-09"), 5000.00);
		Employee empE = new Employee(4567, "Erin Ferrier", LocalDate.parse("1962-11-13"), 15000.00);
		Employee empF = new Employee(4567, "Fred Aster", LocalDate.parse("1995-09-09"), 10000.00);
		List<Employee> emps = Arrays.asList(empA, empB, empC, empD, empE, empF);
		List<Employee> overThirty = emps.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());
		/*
		 * for (Employee e : emps) { if (e.getAge() > 30) {
		 * System.out.println(e.outputString()); } }
		 **/
		List<Employee> betweenFiftyandSixty = emps.stream().filter(emp -> (50 < emp.getAge() && emp.getAge() < 60))
				.collect(Collectors.toList());
		/*
		 * for (Employee e : emps) { if ((e.getAge() > 50)&&(e.getAge() < 60)) {
		 * System.out.println(e.outputString()); } }
		 **/
		List<Employee> overTenThousand = emps.stream().filter(emp -> emp.getSalary() > 10000)
				.collect(Collectors.toList());
		/*
		 * for (Employee e : emps) { if (e.getSalary() > 10000) {
		 * System.out.println(e.outputString()); } }
		 **/
		List<Employee> vowelStart = emps.stream()
				.filter(emp -> (emp.getName().startsWith("A") || emp.getName().startsWith("E")
						|| emp.getName().startsWith("I") || emp.getName().startsWith("O")
						|| emp.getName().startsWith("U") || emp.getName().startsWith("Y")))
				.collect(Collectors.toList());
		/*
		 * for (Employee e : emps) { if ((e.getName().startsWith("A") ||
		 * e.getName().startsWith("E") || e.getName().startsWith("I") ||
		 * e.getName().startsWith("O") || e.getName().startsWith("U") ||
		 * e.getName().startsWith("Y"))) { System.out.println(e.outputString()); } }
		 **/
		System.out.println("All Employees: ");
		outputList(emps);
		System.out.println("_________________________\n");
		System.out.println("\nEmployees over 30: ");
		outputList(overThirty);
		System.out.println("_________________________\n");
		System.out.println("\nEmployees between 50 and 60: ");
		outputList(betweenFiftyandSixty);
		System.out.println("_________________________\n");
		System.out.println("\nEmployees with salary over 10000: ");
		outputList(overTenThousand);
		System.out.println("_________________________\n");
		System.out.println("\nEmployees with names that start with vowels: ");
		outputList(vowelStart);
		System.out.println("_________________________\n");

	}

	public static void outputList(List<Employee> emps) {
		for (Employee e : emps) {
			System.out.println(e.outputString());
		}
	}

}