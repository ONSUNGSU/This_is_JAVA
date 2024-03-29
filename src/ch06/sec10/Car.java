package ch06.sec10;

public class Car {
	// 인스턴스 필드 선언
	int speed; // 인스턴스 필드
	
	// 인스턴스 메소드 선언
	void run() { // 인스턴스 메서드
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() { // 정적 메서드
		// 객체 생성
		Car myCar = new Car(); // Car객체 myCar생성
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
		
	}
	
	public static void main(String[] args) {
		// 정적 메소드 출력
		simulate();  // 메서드 호출 - > 메서드 동작 -> 메서드 정리: 사용한 객체, 필드 정리(가비지 정리)
		
		// 객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}
