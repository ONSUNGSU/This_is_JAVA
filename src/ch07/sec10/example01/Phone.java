package ch07.sec10.example01;

public abstract class Phone { //추상 클래스
	// 필드
	String owner;
	
	// 생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	// 메서드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
