package ch04;
import java.util.*;
//실습 4.1: DetermineAppType.java
//입사 지원자의 평점과 TOEIC 점수에 따라 적절한 메시지를 출력한다

public class Exam1 {

	public static void main(String[] args) {
		 double grade;   // 평점
		 
	     // 토익 점수를 저장하는 변수를 선언한다
	     // 여기에 코드를 삽입하세요
		 int toeic;

	     // Scanner 객체를 생성하고 scan이 가리키게 한다
	     Scanner scan = new Scanner(System.in);

	     // 평점을 입력 받는다
	     System.out.print("평점을 입력하세요: ");
	     grade = scan.nextDouble();

	     System.out.println("TOEIC점수를 입력하세요: "); // 토익 점수를 입력 받는다
	     toeic = scan.nextInt();   // 여기에 코드를 삽입하세요

	      // 평점과 토익 점수에 따라 지원시 적절한 메시지를 출력한다
	      // 여기에 코드를 삽입하세요
	     if(toeic >= 700) {
	    	 if(grade >= 4.0) {
	    		 System.out.printf("면접 대상자 입니다.");
	    	 }else if (grade >= 3.5) {
	    		 System.out.printf("서류 면접 대상자 입니다.");
	    	 }else if(grade >= 3.0) {
	    		 System.out.printf("필기 시험 대상자 입니다.");
	    	 }
	    	 else {
	    		 System.out.printf("지원 할 수 없습니다.");
	    	 }
	     } else {
    		 System.out.printf("지원 할 수 없습니다.");
    	 }
	   }
	}
