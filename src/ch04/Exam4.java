package ch04;
import java.util.Scanner;
public class Exam4 {

	public static void main(String[] args) {
		int amount;
		int balance;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요: ");
		amount =  scan.nextInt();
		
		if(amount >= 300000) {
			balance = amount - 30000;
		}else if(amount >= 100000){
			balance = amount - 5000;
		}else {
			balance = amount;
		} 
		System.out.printf("구매 금액은"+ amount +"원이며 청구 금액은"+ balance + "원 입니다");
		
	}

}
