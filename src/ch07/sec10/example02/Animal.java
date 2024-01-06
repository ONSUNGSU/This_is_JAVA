package ch07.sec10.example02;

public abstract class Animal { //Animal 클래스를 추상클래스로 선언
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	// 추상 메서드 선언 -> 자식쪽에서 오버라이딩 통해서 코드를 작성
	public abstract void sound();
	
}
