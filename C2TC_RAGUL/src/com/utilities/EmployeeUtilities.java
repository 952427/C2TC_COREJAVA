package com.ragul.assignment.utilities;

import com.ragul.assignment.employees.employee;

public class EmployeeUtilities {

	    /**
	     * Prints the details of an employee.
	     *
	     * @param employee the employee whose details are to be printed.
	     */
	    public void printEmployeeDetails(employee employee) {
	        System.out.println("Employee Details:");
	        System.out.println("Name:  " + employee.getName());
	        System.out.println("ID:  " + employee.getEmployeeId());
	        System.out.println("Salary:  " + employee.getSalary());
	    }
	}