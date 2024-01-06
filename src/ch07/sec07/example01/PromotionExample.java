package ch07.sec07.example01;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}

public class PromotionExample {

	public static void main(String[] args) {
		B c = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;  // 자식에서 부모 쪽으로 타입 변환 가능
		A a2 = c;
		A a3 = d;  // 손자에서 조부모 변환은 가능
		A a4 = e;
		
		B b1 = d;  // 자식에서 부모 쪽으로 타입 변환 가능
		C c1 = e;
		
		B b3 = e; //
		C c2 = d; //직접적인 부모가 아닌 경우(상속 관계가 아니다.)에는 변환이 불가능
	}

}
