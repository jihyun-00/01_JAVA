package com.hw2.model.service;

import javax.annotation.processing.SupportedSourceVersion;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	private Employee[] employees;//전체 직원 저장용
	
	private int employeeCount; //직원 수

	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount =0;
		
	}
	
	
	public void addPerson(Person person) {
		if(employeeCount<employees.length && person instanceof Employee) {
		
		System.out.print("직원이 추가되었습니다 - ");
		employees[employeeCount++] = (Employee)person;
		System.out.println(person.getInfo());
		
		} else {
			System.out.println("인원이 모두 충족되었습니다.");
		}
		
	};
	
	@Override
	public void removePerson(String id) {
		for (int i=0; i<employees.length; i++) {
			if (employees[i].getId() == id) {
				System.out.print("직원이 삭제되었습니다 - ");
				System.out.println(employees[i].getInfo());
				employees[i] = null;
				
				for(int j=i; j<employeeCount; j++) {
					employees[j] = employees[i+1];
				}
				employees[--employeeCount] = null;
			}
			return;
		}
		System.out.println("ID : " + id + "인 사람을 찾을 수 없습니다.");
		
	}

	@Override
	public void displayAllPerson() { //전체 직원 명단 출력
		System.out.println("전체 직원 명단 : ");
		for(int i=0; i<employeeCount; i++) {
		System.out.println(employees[i].getInfo());
		}
	}

	
	
	
	

}
