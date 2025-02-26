package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private int prisonerCount;
	private Prisoner[] prisoners = new Prisoner[prisonerCount];
	
	public Prison(int size) {
	}
	
	public Prison(int prisonerCount, Prisoner[] prisoners) {
		super();
		this.prisonerCount = prisonerCount;
		this.prisoners = prisoners;
	}
	
	@Override
	public void addPerson(Person person) {
		
	}
	
	@Override
	public void removePerson(String id) {
		
	}
	
	@Override
	public void displayAllPerson() {
		
	}



	public int getPrisonerCount() {
		return prisonerCount;
	}



	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}



	public Prisoner[] getPrisoners() {
		return prisoners;
	}



	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}
	
	
	
	
	
	
	

}
