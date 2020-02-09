package com.codecafe.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.codecafe.collections.map.pojo.Address;
import com.codecafe.collections.map.pojo.Department;
import com.codecafe.collections.map.pojo.Person;

public class HashMapWithObjectAsKey {

	public static void main(String[] args) {
	
		Department salesDepartment = new Department("Marketing and Sales", "sales");
		Department itDepartment = new Department("Software solutions", "it");
		Department assetDepartment = new Department("Asset Management", "asset");
		
		Map<Person, Department> mapOfPersonToDepartment = new HashMap<>();
		
		Person p1 = new Person(100001, "John", "Doe", 29, new Address("House no. 123", "Planet Namek", 10101));
		
		mapOfPersonToDepartment.put(p1, salesDepartment);
		
		System.out.println("p1 before : "+p1+" hashcode : "+p1.hashCode());
		
		p1.setAge(30);
		p1.setFirstName("Abhinav");
		p1.setLastName("Nath");
		p1.setAddress(new Address("House no. 456", "Planet Earth", 456789));
		
		System.out.println("p1 after : "+p1+" hashcode : "+p1.hashCode());
		
		System.out.println("salesDepartment : "+salesDepartment);
		
		System.out.println("\nget key : "+mapOfPersonToDepartment.get(p1));
		
		System.out.println("\nmapOfPersonToDepartment : "+mapOfPersonToDepartment);

	}

}