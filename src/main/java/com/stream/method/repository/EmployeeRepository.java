package com.stream.method.repository;

import java.util.List;

import com.stream.method.model.Employee;

public class EmployeeRepository {

	public static List<Employee> getAllEmployee() {
		return List.of(

				new Employee(6, "Six", "Pune", 43, "Male", "Security", 2016, 9500.0),
				new Employee(7, "Seven", "Pune", 35, "Male", "Finance", 2010, 27000.0),
				new Employee(3, "Three", "Hyderabad", 29, "Male", "Infrastructure", 2012, 18000.0),
				new Employee(8, "Eight", "Pune", 31, "Male", "Development", 2015, 34500.0),
				new Employee(9, "Nine", "Hyderabad", 24, "Female", "Sales", 2016, 11500.0),
				new Employee(10, "Ten", "Pune", 25, "Female", "Sales", 2009, 22500.0),
				new Employee(2, "Two", "Hyderabad", 25, "Male", "Sales", 2015, 13500.0),
				new Employee(4, "Four", "Pune", 28, "Female", "Development", 2014, 32500.0),
				new Employee(5, "Five", "Pune", 27, "Female", "HR", 2013, 22700.0),
				new Employee(1, "One", "Hyderabad", 32, "Female", "HR", 2011, 25000.0));
	}
}
