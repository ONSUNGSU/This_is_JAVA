package ch07.sec08.example01;

public class HankookTire extends Tire {

	// roll 메서드 재정의: 한국 타이어
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
	
}
