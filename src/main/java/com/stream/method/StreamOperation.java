package com.stream.method;

import java.util.Map;
import java.util.stream.Collectors;

import com.stream.method.model.Employee;
import com.stream.method.repository.EmployeeRepository;

public class StreamOperation {
	public static void main(String[] args) {

		// TODO -1

//		EmployeeRepository.getAllEmployee().stream().map(Employee::getName).forEach(System.out::println);

		// TODO -2

//		EmployeeRepository.getAllEmployee().stream().filter(emp -> emp.getAge() > 25)
//				.map(employee -> employee.getName().toUpperCase()).forEach(System.out::println);

		// TODO -3

//		EmployeeRepository.getAllEmployee().stream().map(Employee::getCity).distinct().forEach(System.out::println);

		// TODO -4

//		long count = EmployeeRepository.getAllEmployee().stream().filter(emp -> emp.getSalary() > 20000.0).count();
//		System.out.println(count);

		// TODO -5

//		EmployeeRepository.getAllEmployee().stream().limit(3).forEach(System.out::println);

		// TODO -6

//		EmployeeRepository.getAllEmployee().stream().skip(3).sorted((o1, o2) -> o1.getAge() - o2.getAge())
//				.forEach(System.out::println);

		// TODO -7

//		boolean anyMatch = EmployeeRepository.getAllEmployee().stream().anyMatch(employee -> employee.getAge() < 18);
//		System.out.println(anyMatch);

		// TODO -8

//		boolean allMatch = EmployeeRepository.getAllEmployee().stream().allMatch(emp -> emp.getAge() < 18);
//		System.out.println(allMatch); //false

		// TODO -9

//		boolean noneMatch = EmployeeRepository.getAllEmployee().stream().noneMatch(emp->emp.getYearOfJoining()>2010);
//		System.out.println(noneMatch);

		// TODO -10

//		Optional<Employee> findAny = EmployeeRepository.getAllEmployee().stream().findAny();
//		findAny.ifPresentOrElse(System.out::println, () -> System.out.println("ok"));

		// TODO -11

//		Optional<Employee> findFirst = EmployeeRepository.getAllEmployee().stream().findFirst();
//		findFirst.ifPresentOrElse(System.out::println, () -> System.out.print("ok"));

		// TODO -12

//		EmployeeRepository.getAllEmployee().stream().map(emp -> emp.getId()).sorted().forEach(System.out::println);

		// TODO -13

//		EmployeeRepository.getAllEmployee().stream().sorted((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))
//				.forEach(System.out::println);

		// TODO -14

//		Optional<Employee> min = EmployeeRepository.getAllEmployee().stream()
//				.min((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
//		min.ifPresentOrElse(System.out::println, () -> System.out.println("ok"));

		// TODO -15

//		Optional<Employee> max = EmployeeRepository.getAllEmployee().stream()
//				.max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
//		System.out.println(max.get());

		// TODO -16

//		double asDouble = EmployeeRepository.getAllEmployee().stream().mapToDouble(emp -> emp.getSalary()).average()
//				.getAsDouble();
//		System.out.println(asDouble);

		// TODO -17

//		EmployeeRepository.getAllEmployee().stream().filter(emp -> emp.getAge() > 25).map(emp -> emp.getName())
//				.forEach(System.out::println);

		// TODO -18

//		EmployeeRepository.getAllEmployee().stream().map(Employee::getDepartment).distinct()
//				.forEach(System.out::println);

		// TODO -19

//		Map<Integer, Double> collect = EmployeeRepository.getAllEmployee().stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
//		System.out.println(collect);

//		Map<String, Double> collect = EmployeeRepository.getAllEmployee().stream().collect(
//				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(collect);

//		Map<String, Long> collect = EmployeeRepository.getAllEmployee().stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(collect);
//		Double collect = EmployeeRepository.getAllEmployee().stream()
//				.collect(Collectors.summingDouble(Employee::getSalary));
//		System.out.println(collect);

//		Optional<Employee> collect2 = EmployeeRepository.getAllEmployee().stream()
//				.collect(Collectors.maxBy((o1, o2) -> o1.getAge() - o2.getAge()));
//		System.out.println(collect2.get());

		Map<String, Long> collect = EmployeeRepository.getAllEmployee().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);
	}

}
