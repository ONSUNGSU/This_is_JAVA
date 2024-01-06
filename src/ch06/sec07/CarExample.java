package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car myCar1 = new Car(); // 기본 생성자를 통해서 인스턴스화가 가능
		
		// Car 클래스 내에 매개변수 3개를 이요하는 생성자가 없기 때문에 
		//Car myCar2 = new Car("현대", "그랜져", "검정");  
		
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
		System.out.println("car2.maxSpeed: " + car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강"); // model, color 생성자를 찾아서 동작
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " + car3.maxSpeed);
		System.out.println();
	
		Car car4 = new Car("택시", "검정", 200); // String,String,Int 생성자를
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println();
		
	}

}
