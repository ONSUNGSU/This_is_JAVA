package ch07.sec08.example01;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		// Car 객체에 Tire객체에 어떤 타이어 객체(Tire, HankookTire, KumhoTire)를 넣는가에 따라 동작이 달라진다
		
		
		
		
		// Tire 객체를 추가
		myCar.tire = new Tire();  //내차(myCar) 타이어(.tire)에 일반타이어(Tire)를 추가
		myCar.run();
		
		// 한국타이어를 추가
		myCar.tire = new HankookTire();
		myCar.run();
		
		// 금호타이어를 추가
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
