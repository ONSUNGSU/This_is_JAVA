package ch07.sec09;

public class Person {
	//필드 선언
	public String name;
	
	// 생성자 선언: 매개변수 이름을 넣어애 객채 생성 가능
	public Person(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("걷습니다.");
	}
}
