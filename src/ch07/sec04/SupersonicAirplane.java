package ch07.sec04;

public class SupersonicAirplane  extends Airplane{
	// 상수 선언
	public static final int NORMAL = 1; // 일반 비행
	public static final int SUPERSONIC = 2; // 초음속 비행
			
	// 상태 필드 선언
	public int flyMode = NORMAL; // 비행모드: 일반 비행
	
	// 부모 fly 메서드를 제정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}else {
			super.fly(); // 부모가 가진 메서드의 코드 그대로 활용, 일반 비행입니다. 출력 부모 메서드 호출
		}
	}
	
}
