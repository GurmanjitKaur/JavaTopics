package com.gurman.interview.java.eight;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Utility {

	public static List<Employee> getEmployees() {
		return Arrays.asList(getEmployee(5), getEmployee(7), getEmployee(2), getEmployee(25), getEmployee(1),
				getEmployee(18), getEmployee(9), getEmployee(4), getEmployee(13), getEmployee(21),getEmployee(21));
	}

	public static Employee getEmployee(int i) {
		return new Employee(i, "name" + i, "dept" + i, getAddress(i), getSubjects(i), getVehicles(i));
	}

	public static Address getAddress(int i) {
		return new Address("city" + i, "pin" + i, i);
	}

	public static List<String> getSubjects(int i) {
		return Arrays.asList("Science" + i, "English" + i, "Hindi" + i, "Punjabi" + i);
	}

	public static List<Vehicle> getVehicles(int i) {
		ZoneId defaultZoneId = ZoneId.systemDefault();

		LocalDate localDateBike = LocalDate.of(2024, ((i * 3) % 11) +1, ((i * 3) % 29)+1);
		Date dateBike = Date.from(localDateBike.atStartOfDay(defaultZoneId).toInstant());

		LocalDate localDatecar = LocalDate.of(2024, ((i * 5) % 11) +1, ((i * 5) % 29)+1);
		Date dateCar = Date.from(localDatecar.atStartOfDay(defaultZoneId).toInstant());

		LocalDate localDatePlane = LocalDate.of(2024, ((i * 2) % 11) +1, ((i * 2) % 29)+1);
		Date datePlane = Date.from(localDatePlane.atStartOfDay(defaultZoneId).toInstant());
		return Arrays.asList(new Vehicle(i, "bike" + i, "bikeModel" + i, dateBike),
				new Vehicle(i, "car" + i, "carModel" + i, dateCar),
				new Vehicle(i, "plane" + i, "planeModel" + i, datePlane));
	}

}
