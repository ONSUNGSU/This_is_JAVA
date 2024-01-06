package ch06.exam01.package1;

public class A {  // default 상태 : 같은 패키지내에서만
	A a1 = new A(true); // 매개변수가 boolean
	A a2 = new A(1); // int
	A a3 = new A("문자열"); //String
	
	//생성자
	public A(boolean b) {  //모든 곳에서 사용 가능 모든 곳에서 접근해서 객체 A 생성 가능하다		
	
	}
	A(int b) {  // 같은 패키지내에서 사용가능 : 같은 패키지내에서 접근해서 객체 A 생성 가능하다		
	
	}
	
	// 같은 파일 내에서만 사용 가능: A클레스 내에서만 사용 가능하다: 메서드
	private A(String b) {
		
	}
}
