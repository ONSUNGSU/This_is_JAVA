package ch07.sec08.example02;

public class Taxi extends Vehicle {
	// 메서드 재정의(오버라이딩)
		@Override
		public void run() {
			System.out.println("택시가 달립니다.");
		}
}
