package ch06.sec07;

public class Car {
	String company = "현대자동차"; 
	String model; 
	String color;
	int maxSpeed;
	
	
	Car(){};  // 기본 생성자는 다른 생성자가 없다면 자동으로 생성
	
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model, String color){
		this(model,color, 250);
//		Car(model, color, 350);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
