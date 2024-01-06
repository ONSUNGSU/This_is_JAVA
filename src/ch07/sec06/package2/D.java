package ch07.sec06.package2;

import ch07.sec06.package1.*;
public class D extends A{ // 다른 패키지 내에 상속을 받지 위해서는 먼저 import로 가져와야 한다.
	
	// 생성자 선언
	public D() {
		super();
		
	}
	public void method() {
		this.field = "value"; // A의 필드
		this.method(); // A의 메서드
	}
	public void method2() {
		A a = new A(); // 객체 생성 X
		a.field = "value"; // 생성된 객체 필드 X
		a.method();  // 생성되 객체 메서드 X
	}
	
	// protected로 설정된 다른 패키지의 클래스를 상속 받더라도 직접적인 객체 생성 되지 않는다
	// protected상속 : 간접적으로 필드나 메서드를 이용할 수 있다
}
