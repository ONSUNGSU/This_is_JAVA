package ch07.sec06.package2;
import ch07.sec06.package1.*;

public class C { // 일반적인 import로는 다른 패키지 의 protected 접근 불가능
	// 메서드 선언
	public void method() {
		A a = new A(); // 객체 생성이 되지 않는다
		a.field = "value"; // 필드사용도 되지 않는다
		a.method(); // 메서드 사용도 되지 않는다
	}
}
