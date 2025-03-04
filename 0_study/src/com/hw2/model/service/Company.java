package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	private Employee[] employees; //전체 직원 저장용
	
	private int employeeCount; //직원 수

	public Company(int size) {
		employeeCount =0;
		
	}
	
	
	public void addPerson(Person person) {
		employees[0] = new Employee("EMP001", "유재석", "기획팀");
		employees[1] = new Employee("EMP002", "정형돈", "개발팀");
		
	};
	
	@Override
	public void removePerson(String id) {
		
	}
	
	@Override
	public void displayAllPerson() { //전체 직원 명단 출력
		
	}

}
