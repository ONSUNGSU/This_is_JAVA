package ch06.exam03.package1;
// 클래스 A와 같은 패키지 내에 있다
public class B {
	
	
	public void method() {
		// A 클래스에 접근하여 a 객체 생성A
		A a = new A();
	
		// A 클래스에 접근하여 a 객체 생성
		a.field1 = 1; // field1: public 이라서 접근 가능
		a.field2 = 1; // field2: default 같은 패키지 내라서 접근 가능
		a.field3 = 1; // field3: private 라서 같은 파일 안에 아니라 접근 불가능
		
		//a 객체의 메서드 실행
		a.method1(); //method1: public이라서 실행 가능
		a.method2(); //method2: default 같은 패키지 내라서 실행 가능
		a.method3(); //method3: private라서 같은 파일 안에 아니라서 실행 불가능
		
	} 
}
