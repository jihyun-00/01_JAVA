package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners;
	
	private int prisonerCount;
	
	public Prison(int size) {
		prisonerCount=0;
	}
	
	public void addPerson(Person person) {};
	
	@Override
	public void removePerson(String id) {
		
	}
	
	@Override
	public void displayAllPerson() { //전체 수감자 명단 출력
		
	}

}
