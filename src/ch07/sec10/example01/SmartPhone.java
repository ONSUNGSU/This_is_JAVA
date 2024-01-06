package ch07.sec10.example01;

public class SmartPhone extends Phone { // 부모 Phone클래스 상속
	
	// 생성자 선언
	SmartPhone(String owner){
		super(owner); // 부모 생성자 호출
	}
	
	// 메서드 선언
	void internetSerch(){
		System.out.println("인터넷을 검색합니다.");
	}
}
