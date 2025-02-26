package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private int employeeCount; //직원수
	
	private Employee[] employees;
	
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount=0;
	}
	
	
	public Company(int employeeCount, Employee[] employees) {
		super();
		this.employeeCount = employeeCount;
		this.employees = employees;
	}



	@Override
	public void addPerson(Person person) {
		if(employees[employeeCount] == null) {
			employees[employeeCount] = new Employee(person.getId(),person.getName(),
					((Employee)person).getPosition());
			System.out.println("직원이 추가되었습니다. - " + employees[employeeCount].getInfo());
			
			employeeCount++;
		} else if(employeeCount == employees.length) {
			System.out.println("인원이 모두 충원되었습니다.");
			
		}
				
		//System.out.printf("직원이 추가되었습니다. - ID : %s, 이름 : %s, 직책 : %s\n", person.getId(), person.getName(), position);
	}
	
	@Override
	public void removePerson(String id) {		
	}
	
	@Override
	public void displayAllPerson() {	
		System.out.println("전체 직원 명단 : ");
		for(int i=0; i<employees.length; i++) {
			if(employees[i] == null) {
				continue;
			}else {
				System.out.println(employees[i].getInfo());
			}
			
		}
		
		//((Employee)person).getInfo();
	}

	
	
	
	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	
}
