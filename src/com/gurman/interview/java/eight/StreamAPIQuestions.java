package com.gurman.interview.java.eight;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPIQuestions {

	public static void main(String[] args) {
		StreamAPIQuestions streamAPIQuestions = new StreamAPIQuestions();
		List<Employee> employees = Utility.getEmployees();
		System.out.println("nameStartWithString: " + streamAPIQuestions.nameStartWithString(employees, "n"));
		System.out.println("nameNotStartWithString: " + streamAPIQuestions.nameNotStartWithString(employees, "H"));
		System.out.println(
				"nameStartWithStringReturnMap: " + streamAPIQuestions.nameStartWithStringReturnMap(employees, "n"));
		System.out.println("nameStartWithStringReturnTreeMap: "
				+ streamAPIQuestions.nameStartWithStringReturnTreeMap(employees, "n"));
		System.out.println(
				"nameStartWithStringReturnDate: " + streamAPIQuestions.nameStartWithStringReturnDate(employees, "n"));
		System.out.println(
				"nameStartWithStringGroupBy: " + streamAPIQuestions.nameStartWithStringGroupBy(employees, "n"));
	}

	public List<Employee> nameStartWithString(List<Employee> employees, String prefix) {
		Predicate<String> predicate = s -> s.startsWith(prefix);
		return employees.stream().filter(emp -> predicate.test(emp.getName())).collect(Collectors.toList());
	}

	public List<Employee> nameNotStartWithString(List<Employee> employees, String prefix) {
		Predicate<String> predicate = s -> s.startsWith(prefix);
		return employees.stream().filter(emp -> predicate.negate().test(emp.getName())).collect(Collectors.toList());
	}

	// list to HashMap
	public Map<Integer, Employee> nameStartWithStringReturnMap(List<Employee> employees, String prefix) {
		Predicate<String> predicate = s -> s.startsWith(prefix);
		return employees.stream().filter(emp -> predicate.test(emp.getName()))
				.collect(Collectors.toMap(Employee::getId, Function.identity(),(o1,o2)->o1));
	}

	public Map<Employee, String> nameStartWithStringReturnTreeMap(List<Employee> employees, String prefix) {
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
		Predicate<String> predicate = s -> s.startsWith(prefix);
		return employees.stream().filter(emp -> predicate.test(emp.getName())).collect(Collectors
				.toMap(Function.identity(), Employee::getDepartment, (o1, o2) -> o1, () -> new TreeMap<>(comparator)));
	}

	public Map<Date, String> nameStartWithStringReturnDate(List<Employee> employees, String prefix) {
		Predicate<String> predicate = s -> s.startsWith(prefix);
		return employees.stream().filter(emp -> predicate.test(emp.getName()))
				.collect(Collectors.toMap(
						e -> e.getVehicles().stream().max(Comparator.comparing(Vehicle::getDate)).get().getDate(),
						Employee::getDepartment,(o1, o2) -> o1, TreeMap::new));
	}
	
	public Map<Object, List<String>> nameStartWithStringGroupBy(List<Employee> employees, String prefix) {
		Predicate<String> predicate = s -> s.startsWith(prefix);
		return employees.stream().filter(emp -> predicate.test(emp.getName()))
				.collect(Collectors.groupingBy(e->e.getVehicles().stream().max(Comparator.comparing(Vehicle::getDate)).get().getDate(),
						Collectors.mapping(Employee::getName, Collectors.toList())));
	}

//	public Map<Integer, Employee> nameStartWithStringReturnTreeMap2(List<Employee> employees, String prefix) {
//		Predicate<String> predicate = s -> s.startsWith(prefix);
//		return employees.stream().filter(emp -> predicate.test(emp.getName()))
//				.collect(Collectors.toMap());
//	}
}
