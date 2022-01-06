package com.hcl.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*1.Add the employee details in the arraylist which
 * has properties as id,name & city,also to print the
 * employee details whic you have added in the ArrayList.
*
*2.In which condition ArrayList should be used. same type dynamic length
*
*3.For which scenarios Map should be used. when you need a key
*
*4.For which scenarios Set should be used.
 * */

public class Collections {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Employee empK = new Employee(1234, "Kelly Grace", "Austin", "Agent K");
		Employee empS = new Employee(2345, "Sabrina Duncan", "San Jose", "Agent S");
		Employee empJ = new Employee(3456, "Jill Monroe", "New York", "Agent J");
		Employee empT = new Employee(4567, "Tiffany Welles", "Austin", "Agent T");
		System.out.println("ArrayList:\n");
		ArrayList<Employee> empArrList = new ArrayList<Employee>();
		displayLoopA(empArrList);
		empArrList.add(empK);
		empArrList.add(empS);
		empArrList.add(empJ);
		displayLoopA(empArrList);
		empArrList.add(empT);
		displayLoopA(empArrList);
		System.out.println("HashMap:\n");
		HashMap<String, Employee> empHashMap = new HashMap<String, Employee>();
		displayLoopH(empHashMap);
		empHashMap.put(empK.getCodeName(), empK);
		empHashMap.put(empS.getCodeName(), empS);
		empHashMap.put(empJ.getCodeName(), empJ);
		displayLoopH(empHashMap);
		empHashMap.put(empT.getCodeName(), empT);
		displayLoopH(empHashMap);
		System.out.println("Set:\n");
		Set<Employee> empSet = new HashSet<Employee>();
		displayLoopS(empSet);
		empSet.add(empK);
		empSet.add(empS);
		empSet.add(empJ);
		displayLoopS(empSet);
		empSet.add(empT);
		displayLoopS(empSet);

	}

	public static void displayLoopA(ArrayList<Employee> list) {
		System.out.println("All employees:");
		for (Employee e : list) {
			System.out.println("\n" + e.outputString());
		}
		System.out.println("__________________");
	}

	public static void displayLoopH(HashMap<String, Employee> map) {
		System.out.println("All employees:");
		for (String key : map.keySet()) {
			System.out.println(key + ":\n" + map.get(key).outputString() + "\n");
		}
		System.out.println("__________________");
	}

	public static void displayLoopS(Set<Employee> set) {
		System.out.println("All employees:");
		for (Employee e : set) {
			System.out.println("\n" + e.outputString());
		}
		System.out.println("__________________");
	}

}
