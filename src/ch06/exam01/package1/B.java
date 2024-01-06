package ch06.exam01.package1;

public class B {
	//A a; // A 클래스에 접근하여 a 객체 선언 // A클래스에 접근
	
	A a1 = new A(true); // boolean타입: public이라서 접근 가능
	A a2 = new A(1); // int타입: default: 같은 패키지라서 접근 가능
	// A a3 = new A("문자열"); // String 타입: private 같은 파일내가 아니라서 접근 불가능
}
