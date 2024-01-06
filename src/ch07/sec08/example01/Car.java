package ch07.sec08.example01;

public class Car {
	// 필드 선언
	public Tire tire; //객체 Tire 형을 가진 tire필드 생성
	
	public void run() { // Car가 움직이면
		tire.roll();	// Tire가 roll 굴러가게 실행
	}
}
