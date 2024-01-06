package ch06.sec08;

public class Calculator {
//	void powerOn(){ // void: 리턴값이 없는 매서드
//		System.out.println("전원을 켭니다.");
//	}
//	void powerOff(){ // void: 리턴값이 없다
//		System.out.println("전원을 끕니다.");
//	}
//	
//	int plus(int x, int y) {
//		int result  = x+y;
//		return result;
//	}
//	double divide(int x, int y) {
//		double result = (double)x/(double)y;
//		return result;
//	}
	
	// 매개변수의 개수를 다르게 하여 메서드 오버로딩
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
