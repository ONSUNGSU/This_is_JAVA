package ch07.sec09;

public class InstanceofExample {

	// 정적 메서드 생성
	public static void personInfo(Person person) {
		System.out.println("name:" + person.name);
		person.walk();
	// 지금 들어온 person객체가 Student 객체 있었나?
		if (person instanceof Student) { //원래 Student객채가 있었나
			Student student = (Student) person; // 원래 있던 Student객체로 강제 형변환
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		
		
		
		
		// JAVA 12 이후 : True 일때 자동으로 강재형변환(원래타입으로 되돌린다.)
//	if (person instanceof Student student) {
//		System.out.print("studentNo: " + student.studentNo);
//		student.study();
//	}
}
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
		
		}
	}


