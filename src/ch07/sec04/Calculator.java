package ch07.sec04;

public class Calculator {
	// 메서드 선언
	public double areaCircle(double r) {// 반환 타입 double, 메개 변수: 반지름
		System.out.println("Calculator 객체의 areaCircle() 실행");
		
		return 3.14159 * r * r;
	}
}
