package com.gurman.interview.java;

import com.gurman.interview.model.Address;
import com.gurman.interview.model.Building;
import com.gurman.interview.model.Student;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Building building = new Building("Rippy Enclave", 204, 2);
		Address address = new Address("Lasalle", "Canada", building);
		Student student1 = new Student("Gurmanjit Kaur", 1, 1, address);
		
		System.out.println(student1);
		
		Student student2 = student1;
		student2.setPosition(2);
		
		System.out.println("\nStudent1 after change in Student 2 in assignment operator case\n");
		System.out.println(student1);
		
		//Deep copy
		Student student3 = (Student) student1.clone();
		student3.setPosition(3);
		student3.setRollNumber(3);
		student3.getAddress().setCity("Lasalle3");
		student3.getAddress().getBuilding().setBuildingName("Rippy Cottage 4");
		
		System.out.println("\nStudent1 after change in Student 3 in clone deep copy case\n");
		System.out.println(student1);
	}
	

}
