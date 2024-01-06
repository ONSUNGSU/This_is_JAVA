package ch06.sec10;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// 객체 생성 안함 , static 멤버에 접근 가능
		double result1 = 10*10*Calculator.pi; //pi에 접근
		int result2 = Calculator.plus(10,5); // 메서드plus에 접근
		int result3 = Calculator.minus(10,5); // 메서드minus에 접근
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
//		Calculator myCalcu = new Calcurator();
//		// 객체 생성 안함 , static 멤버에 접근 가능
//		double result4 = 10*10*myCalcu.pi; //pi에 접근\
//		int result5 = myCalcu.plus(10,5); // 메서드plus에 접근
//		int result6 = myCalcu.minus(10,5); // 메서드minus에 접근
//		
//		System.out.println("result4: "+result4);
//		System.out.println("result5: "+result5);
//		System.out.println("result6: "+result6);
	}

}
