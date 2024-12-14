package com.ragul.assignment.utilities;

public class AssignmentMain {
	 public static void main(String[] args) {
	        // Create instances of Manager and Developer
	        com.ragul.assignment.employees.Manager manager =
	                new com.ragul.assignment.employees.Manager("Alice", 101, 75000, "HR");
	        com.ragul.assignment.employees.Developer developer =
	                new com.ragul.assignment.employees.Developer("Bob", 102, 80000, "Java");

	        // Create an instance of EmployeeUtilities
	        com.ragul.assignment.utilities.EmployeeUtilities utilities = new com.ragul.assignment.utilities.EmployeeUtilities();

	        // Use utilities to print employee details
	        utilities.printEmployeeDetails(manager);
	        utilities.printEmployeeDetails(developer);
	    }
	}

