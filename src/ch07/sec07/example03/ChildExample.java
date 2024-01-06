package ch07.sec07.example03;

public class ChildExample {

	public static void main(String[] args) {
		
		// 객체 생성:  자식 객체를  부모 타입 객체 생성(자동 형변환)
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		System.out.println("parent.field1: " + parent.field1);
		
		//parent.field2 = "data2"; // 자동 형변환으로 field2가 삭제
		//parent.method3();  // 자동 형변환으로 method3 삭제
		
		
		// 강제 형변환 부모 -> 자식으로 변환
		Child child = (Child)parent;
		
		child.field2 = "data2"; // 강제 형변환으로 field2가 추가
		child.method3(); //강제 형변환으로 methid3 추가
		
		System.out.println("child.field: " + child.field2);
		
		
		

	}

}
