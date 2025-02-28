package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Friend {
	
	private String name;
	
	public Friend() {
	}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public void pickLeader(List<Friend> arr) {
		
		int i = (int)(Math.random() * (arr.size()));
		System.out.println(arr.get(i).getName()+ "가 떡잎방범대 대장이다!");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
