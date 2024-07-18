package com.stream.method.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {

	private Integer id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private Double salary;

}
