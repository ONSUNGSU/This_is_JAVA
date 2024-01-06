package ch06.exam01.package2;
import ch06.exam01.package1.*;
public class C {
	//A a;  // 같은 패키지 안에 없어서 접근이 불가능한 상태 default 객체 접근이 불가
	//B b;  // B클래스에 접근 가능 public이라서 접근 가능(import)
	

	A a1 = new A(true); // boolean타입: public이라서 접근 가능
	//A a2 = new A(1); // int타입: default: 같은 패키지 안에 없어서 접근이 불가능
	//A a3 = new A("문자열"); // String 타입: private 같은 파일내가 아니라서 접근 불가능

}
