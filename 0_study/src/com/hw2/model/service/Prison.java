package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners;
	
	private int prisonerCount;
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount=0;
	}
	
	public void addPerson(Person person) {
		if(person instanceof Prisoner && prisonerCount<prisoners.length) {
			prisoners[prisonerCount++] = (Prisoner)person;
			System.out.println("수감자가 추가되었습니다. - " + person.getInfo());
		}else {
			System.out.println("수감자가 모두 충원되었습니다.");
		}
	};
	
	@Override
	public void removePerson(String id) {
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i].getId()==id) {
				System.out.println("수감자가 삭제되었습니다 - " + prisoners[i].getInfo());
				prisoners[i]=null;
				for(int j=i; j<prisoners.length; j++) {
					prisoners[j] = prisoners[i+1];
				}
			}
			prisoners[--prisonerCount] = null;
			return;
		}
		System.out.println("ID : " + id + " 해당하는 수감자가 없습니다.");
		
	}
	
	@Override
	public void displayAllPerson() { //전체 수감자 명단 출력
		
		System.out.println("전체 수감자 명단 : ");
		for(int i=0; i<prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
		}
		
	}

}
