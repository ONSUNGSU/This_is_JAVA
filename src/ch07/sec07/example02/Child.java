package ch07.sec07.example02;

public class Child extends Parent{

	// 부모 메서드 2을 오버라이딩하여 내용을 수정
	@Override
	public void method2() { // 수정된 메서드다.
		System.out.println("Child-method2()");
	}
	
	// 자식 객체에 새로운 메서드를 추가 했다
	public void method3() { // 추가된 메서드다.
		System.out.println("Child-method3()");
	}

}
