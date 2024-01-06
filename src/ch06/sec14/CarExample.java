package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		// getter,setter 이용하는 이유, 
		//private 설정된 field에 접근해서 값을 수정하거나 값을 가져오기
		
		
		//  Car 객체 생성
		Car myCar = new Car();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		// 정상적인 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) { 
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed() );

	}

}
