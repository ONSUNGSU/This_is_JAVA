package ch07.sec08.example02;

public class DriveExample {

	public static void main(String[] args) {
		// 운전자 객채 생성
		Driver driver = new Driver();
		
		// 버스 객체 생성
		Bus bus = new Bus();
		driver.drive(bus); // 버스 객체를 운전하는 드라이버
		
		driver.drive(new Bus());
		
		//택시 객체 생성
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		driver.drive(new  Taxi());
	}

}
