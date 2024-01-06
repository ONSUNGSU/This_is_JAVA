package ch07.sec06.package1;

public class B {
	public void method() {
		A a = new A(); //같은 패키자 내에서 protected A 클래스에 접근 가능
		a.field = "value";
		a.method();
	}
}
