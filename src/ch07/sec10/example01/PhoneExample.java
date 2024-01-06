package ch07.sec10.example01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone myphone = new Phone("홍길동"); // phone 클래스가 추상 클래스이기 때문
		SmartPhone smartphone = new SmartPhone("홍길동");
		// 자식 클래스에서 객체 생성이 됨
		
		smartphone.turnOn(); // 부모 메서드 기능
		smartphone.internetSerch(); // 자식 메서드 기능
		smartphone.turnOff();; // 부모 메서드 기능
	}

}
