package ch05;
import java.util.*;
public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		
		int studentNum = 0;  //학생수
		int[] scores = null;  // 학생뱔 점수 배열로 저장
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if(selectNo == 1 ) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2){
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+ i + "]>");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+ i + "]:" + scores[i]);
				}
			}else if(selectNo == 4) {
				
				int max = scores[0];
				int sum = 0;
				double Avg;
				for(int i=0; i< scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					
					sum += scores[i];
					
					 
				}
				Avg = (double)sum/scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + Avg);
			}else {
				System.out.println("프로그램 종료");
				run  = false;
				break;
			}
			
		}
	}

}
