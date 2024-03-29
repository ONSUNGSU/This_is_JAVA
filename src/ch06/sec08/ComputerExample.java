package ch06.sec08;

public class ComputerExample {
	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		// 매개 변수의 갯수 상관없이 합산
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: "+ result1);
		
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2: "+ result2);
		
		
		// 매개 변수에 배열 입력가능
		int[] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3: "+ result3);
		
		// 매개 변수에 직접 배열을 입력 가능
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out .println("result4: "+ result4);
		
	}	
}
