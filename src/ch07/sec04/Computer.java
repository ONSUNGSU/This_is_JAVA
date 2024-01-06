package ch07.sec04;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}  //자식 클래스 부모: Calculator
	
	
	
	
	//메서드 오버라이딩 Override
//	@Override
//	public double areaCircle(double r) {
//		System.out.println("Computer 객체의 areaCircle() 실행");
//		return Math.PI* r * r;
//	}
	
	
}
