package ch04;

import java.util.Scanner;

public class Ch4_5exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu; // 점수
		int count = 0; //점수들의 수
		int max = -1; // 최고 점수
		int min = 101; // 최저 점수
		int sum = 0; // 합계
		double aver; // 평균 점수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		jumsu = scan.nextInt(); 
			
		while(jumsu!=-99) {
			count++;		   
		   	sum += jumsu; 
		    if(jumsu < min) {
		    	min = jumsu;
		    }
		    if(jumsu > max) {
		    	max = jumsu;
		    }
		  
		    System.out.print("점수를 입력하세요: ");
		    jumsu = scan.nextInt();
		}
		System.out.println(max);
		System.out.println(min);
		aver = sum/count;
		System.out.println(aver);
	
		
	}

}
