package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);
	Set<Toy> toyset = new LinkedHashSet<>();
	Map<Integer, String> materialMap = new HashMap<>();
	
	public ToyFactory() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		toyset.add(new Toy("키시미시", 15000, "분홍색", 5, "19940505", addMaterials(1, 4)));
		toyset.add(new Toy("캣냅", 27000, "보라색", 8, "19960128",addMaterials(1, 2)));
		toyset.add(new Toy("파피", 57000, "빨간색", 12, "19931225",addMaterials(1, 2)));
		toyset.add(new Toy("허기워기", 12000, "파란색", 5, "19940312",addMaterials(1, 2)));
		toyset.add(new Toy("마미롱레그", 36000, "분홍색", 8, "19950805",addMaterials(1,2, 4)));
	}
	
	public Set<String> addMaterials(Integer...material){
		
		Set<String> addMaterials = new HashSet<>();
		
		for(Integer materialKey : material) {
			
			String materialV = materialMap.get(materialKey);
			
			if(materialKey!=null) {
				addMaterials.add(materialV);
			}
			
		}
		
		return addMaterials;
	}
	

	
	
	
	
	
	public void displayMenu() {
		
		int menuNum = -1;
		
		do {
		System.out.println("\n<<플레이타임 공장>>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("선택 : ");
		menuNum = sc.nextInt();
		System.out.println();
		
		switch(menuNum) {
		case 1 : viewToy(); break;
		case 2 : addToy(); break;
		case 3 : deleteToy(); break;
		case 4 : break;
		case 5 : break;
		case 6 : addMaterial(); break;
		case 7 : deleteMaterial(); break;
		case 0 : break;
		default : System.out.println("해당하는 번호만 입력해주세요.");
		}
		
		}while(menuNum!=0);
	}
	
	public void viewToy() { //재료 이상하게 출력
		System.out.println("<전체 장난감 목록>");
		int index =1;
		if(toyset.isEmpty()) {
			System.out.println("장난감이 없습니다.");
			return;
		}
			for(Toy t : toyset) {
				System.out.println(index++ + ". " + t);
		}
	}

	public void addToy() {
		System.out.println("\n<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용가능연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.next();
		sc.nextLine();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String year = sc.next();
		
		Set<String> m = new LinkedHashSet<>();
		String add;
		
		do {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			add = sc.next();
			
			if(add.equals("q")) {
				break;
			}
			
			m.add(add);
			
			
			
		}while(!add.equals("q"));
		
		toyset.add(new Toy(name, price, color, age, year, m));
		System.out.println("새로운 장난감이 추가되었습니다.");
	}

	public void deleteToy() {
		System.out.print("\n삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(Toy t : toyset) {
			if(t.getName().equals(name)) {
				toyset.remove(t);
				break;
			}
		}
		System.out.println("장난감이 삭제되었습니다.");
	}

	public void viewByYear() { //모르겟다..
		System.out.println("<제조일순으로 장난감 정렬>");
		
		
	}
	
	public void viewByAge() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		Map<Integer , List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		
		for(Toy t : toyset) {
			int age=t.getAge();
			
			toysByAge.putIfAbsent(age, new ArrayList<Toy>());
			
			toysByAge.get(age).add(t);
		}
		
		for(Entry<Integer, List<Toy>> entry : toysByAge.entrySet()) {
			int age = entry.getKey();
			List<Toy> toylist = entry.getValue();
			
			System.out.println("[연령 : " + age + "세]");
			
			int index = 1;
			for(Toy t : toylist) {
				System.out.println(index + "." + t);
				index++;
			}
		}
		
	}
	
	public void addMaterial() {
		System.out.println("<재료 추가>");
		System.out.println("--현재 등록된 재료--");
		
		for(Map.Entry<Integer, String> m : materialMap.entrySet()) {
		System.out.println(m.getKey() + " : " + m.getValue());
		}
		System.out.println("----------------------------------");
		
		System.out.print("재료 고유번호(key)입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String m = sc.next();
		
		for(Map.Entry<Integer, String> s : materialMap.entrySet()) {
			if(key==s.getKey()) {
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
				System.out.print("덮어쓰시겠습니까?(y/n) : ");
				String answer = sc.next();
				
				if(answer.equalsIgnoreCase("y")) {
					materialMap.put(key, m);
					return;
			}else {
				System.out.println("재료 추가가 취소되었습니다.");
				return;
			}
			}
			
		}
		materialMap.put(key, m);
		System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		
		for(Map.Entry<Integer, String> w : materialMap.entrySet()) {
			System.out.println(w.getKey() + " : " + w.getValue());
		}
		
	}

	public void deleteMaterial() {
		System.out.println("<재료 삭제>");
		System.out.println("--현재 등록된 재료--");
		for(Map.Entry<Integer, String> m : materialMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		System.out.println("--------------------------------");
		System.out.print("삭제할 재료 입력 : ");
		String v = sc.next();
		
		for(Map.Entry<Integer, String> m : materialMap.entrySet()) {
			if(m.getValue().equals(v)) {
				materialMap.remove(m.getKey());
				System.out.println("재료 '" + v + "'가 성공적으로 제거되었습니다.");
				return;
			}
			
		}
		System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		
		
	}
}
