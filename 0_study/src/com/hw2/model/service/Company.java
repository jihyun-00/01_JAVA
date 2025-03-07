package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	private List<Employee> employees = new ArrayList<>(); //전체 직원 저장용
	
	//private int employeeCount; //직원 수

	/*
	public Company(int size) {
		employees = new Employee[size];
		employeeCount =0;
		
	}
	*/
	
	public void addPerson(Employee emp) {
		System.out.print("직원이 추가되었습니다 - ");
		employees.add(new Employee(emp.getId(), emp.getName(), emp.getPosition()));
		
	};
	
	@Override
	public void removePerson(String id) {
		System.out.print("직원이 삭제되었습니다 - ");
		employees.remove(id);
	}

	@Override
	public void displayAllPerson() { //전체 직원 명단 출력
		System.out.println("전체 직원 명단 : ");
		for(Employee e : employees) {
		System.out.println(e);
		}
	}

	
	
	
	

}
