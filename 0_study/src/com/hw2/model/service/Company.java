package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	private Employee[] employees; //전체 직원 저장용
	
	private int employeeCount; //직원 수

	public Company(int size) {
		employees = new Employee[size];
		employeeCount =0;
		
	}
	
	
	public void addPerson(Person person) {
		employees[employeeCount] = (Employee)person;
		employeeCount++;
		
	};
	
	@Override
	public void removePerson(String id) {
		
	}
	
	@Override
	public void displayAllPerson() { //전체 직원 명단 출력
		
		
	}

}
