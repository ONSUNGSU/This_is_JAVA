package ch04;

import java.util.Scanner;

public class Ch4_5exam2 {

	public static void main(String[] args) {
		int score;
		int totalCount = 0; 
		int Acount = 0;  
		int Bcount = 0;  
		int Ccount = 0;  
		int Dcount = 0;  
		int Fcount = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");
		score = scan.nextInt();
		
		while(score != -1) {
			totalCount++;
			if(score>=90) {
				Acount++;
			}else if(score>=80) {
				Bcount++;
			}else if(score>=70) {
				Ccount++;
			}else if(score>=60) {
				Dcount++;
			}else {
				Fcount++;
			}
			System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");
			score = scan.nextInt();
			
		}
		System.out.println("점수들의 총수 = " + totalCount);
		System.out.println("A 학점 수 = " + Acount);
		System.out.println("B 학점 수 = " + Bcount);
		System.out.println("C 학점 수 = " + Ccount);
		System.out.println("D 학점 수 = " + Dcount);
		System.out.print("F 학점 수 = " + Fcount);
	}

}
