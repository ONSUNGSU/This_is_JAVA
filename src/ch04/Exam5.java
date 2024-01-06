package ch04;
import java.util.Scanner;
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number;
		boolean multiple = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요: ");
		Number = scan.nextInt();
		
		if(Number%3 == 0) {
			System.out.print("3의 배수입니다.");
			multiple = true;
		}
		if(Number%5 == 0){
			System.out.print("5의 배수입니다.");
			multiple = true;
		} 
		if(Number%8 == 0){
			System.out.print("8의 배수입니다.");
			multiple = true;
		}
		if(multiple == false){
			System.out.print("어느 배수도 아닙니다.");	
		}
		
	}

}
