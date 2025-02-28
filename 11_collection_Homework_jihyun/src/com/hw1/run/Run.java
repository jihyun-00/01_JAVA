package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {

		//Fridend 객체만 넣을 수 있는 ArrayList 객체 생성 후
		//짱구, 철수, 유리, 훈이, 맹구, 객체 생성하여 ArrayList 추가하기
		List<Friend> arr = new ArrayList<>();
		arr.add(new Friend("짱구"));
		arr.add(new Friend("유리"));
		arr.add(new Friend("훈이"));
		arr.add(new Friend("철수"));
		arr.add(new Friend("맹구"));
		
		
		//List에서 다섯객체 중 랜덤으로 하나를 뽑아
		//골목대장이 누군지 출력하기
		Friend f = new Friend();
		f.pickLeader(arr);
		
		
//		int i = (int)(Math.random() * (arr.size()));
//		System.out.println(arr.get(i).getName()+ "가 떡잎방범대 대장이다!");
	}

}
