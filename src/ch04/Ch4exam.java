package ch04;

import java.util.Random;
import java.util.Scanner;
public class Ch4exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetNumber;  // 사용자가 맞추려고 노력하는 숫자
		int guessNumber;   // 사용자가 추측한 숫자
		int count;// 추측한 숫자
		final int sentinel = -99; // 감시 숫자
		String again  = "예"; // 계속 여부
		
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		
		while(again.equals("예")) {
			count = 0;
			targetNumber = generator.nextInt(100) + 1; 
			System.out.print("숫자를 입력해주세요: ");
	    	guessNumber = scan.nextInt();
			
		    while(guessNumber != -99) {
		    	count++;
		    	if(guessNumber > targetNumber) {
		    		System.out.print("숫자가 큽니다.");
		    	}else if(guessNumber < targetNumber) {
		    		System.out.print("숫자가 작습니다.");
		    	}else {
		    		System.out.printf("정답 입니다."+guessNumber);	
		    		break;
		    	}
		    	System.out.print("숫자를 입력해주세요: ");
		    	guessNumber = scan.nextInt();	
		    }
		    System.out.print(count);
		    System.out.print("계속하기를 원하는가? (예 혹은 아니요)");
		    again = scan.next();	
		}
		
	}

}
