package ch07.sec10.example02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		//Animal animal = new Animal(); // 추상 클래스
		
		Dog dog = new Dog(); //객체 생성
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		// 매개변수 다양성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
