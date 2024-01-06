package ch06.sec15;
// 클래스 대문자
// 객체 변수 : 소문자
public class Singleton { //클래스는 public
	private static Singleton singleton = new Singleton();
	
	// static: 파일을 호출하면 바로 생성
	private Singleton() {  // 생성자가 Singleton
		
	}
	
	// static 바로 생성
	static Singleton getInstance() {
		return singleton;
	}
}
