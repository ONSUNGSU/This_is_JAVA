package ch06.exam03.package2;

import ch06.exam03.package1.A;

public class C {
	public C() {
		// A 클래스에 접근하여 a 객체 생성: import를 통해서 다른 패키지 접근
		A a = new A();
	
		// a 객체에 필드값 변경
		a.field1 = 1; // field1: public 이라서 접근 가능
		a.field2 = 1; // field2: default 같은 패키지 내라서 접근 가능
		a.field3 = 1; // field3: private 라서 같은 파일 안에 아니라 접근 불가능
		// a.field3의 값을 변경하고 싶다. 가능한 방법이 있다
		//a 객체의 메서드 실행
		a.method1(); //method1: public이라서 실행 가능
		a.method2(); //method2: default 같은 패키지 내라서 실행 가능
		a.method3(); //method3: private라서 같은 파일 안에 아니라서 실행 불가능
		
	} 
}
