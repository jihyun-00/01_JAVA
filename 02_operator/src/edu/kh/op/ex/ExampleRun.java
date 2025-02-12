package edu.kh.op.ex;

//실행용 클래스(메인메서드 존재)
public class ExampleRun {

	public static void main(String[] args) {

		//OpExample 생성
		OpExample opEX = new OpExample();
		//OpExample이라는 클래스(설계도)를 이용해서
		//객체를 생성하는데, 그 객체 이름이 opEx다
		//같은 패키지안에 있는 클래스는 import 하지 않아도 됨
		
		opEX.ex4(); //opEx가 가지고 있는 기능(메서드) 중 ex1 이름의 메서드를 호출(실행)
		
	}

}
