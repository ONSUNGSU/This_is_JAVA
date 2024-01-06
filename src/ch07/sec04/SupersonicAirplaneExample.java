package ch07.sec04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff(); //이륙
		sa.fly(); // 비행: 일반 비행
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // 모드 변경
		sa.fly(); // 비행: 초음속 비행
		sa.flyMode = SupersonicAirplane.NORMAL; // 모드 변경
		sa.fly();// 비행: 일반 비행
 		sa.land(); // 착륙
	}

}
