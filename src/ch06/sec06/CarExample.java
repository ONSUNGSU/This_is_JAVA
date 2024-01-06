package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// main에서 car 클래스 사용
		
		//car 객체 생서
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxspeed);
		System.out.println("현재속도: " + myCar.speed); // 초기값 설정이 안되어 있어 기본값 0
		
		/// Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		myCar.color = "빨강";
		System.out.println("색상 변경: " + myCar.color);
	}

}
