package ch07.sec03;

public class SmartPhone extends Phone{
	// 자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color); //부모 생성자 호출 SmartPhone(); SmartPhone(model,color)
		//this.model = model; 부모 생성자 대입 하기때문에 자식은 다시 대입할 필요가 없다
		//this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
		
	}
}


