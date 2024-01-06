package ch06.sec10;

public class Calculator {
	static double pi = 3.14159; //정적 필드(고정 필드)
	
	static int plus(int x, int y) {  // 정적 메서드
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
