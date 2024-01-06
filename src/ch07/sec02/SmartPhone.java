package ch07.sec02;

public class SmartPhone extends Phone { // phone 가진 기능에 기능을 추가 상속을 이용해서 Phone + SmartPhone
	// extends Phone // Phone 가진 필드와 메서드를 참고해서 가져온다
	// 필드 추가 wifi 상태
	public boolean wifi;
	
	// 생성자
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 메서드 : 와이파이상태 변경, 인터넷 연결
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합나다.");
	}
	
}
