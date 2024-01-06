package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		
//		Calculator myCalc = new Calculator();
//		
//		myCalc.powerOn();
//		
//		int result1 = myCalc.plus(5, 6); // 11값이 리턴한다
//		System.out.println("result1 = "+result1);
//		
//		// 리턴값이 없다면, 메서드명을 입력해서 바로 실행
//		// 리턴값이 있다면. 메서드명을 실행해서 당일 변수를 지정
//		
//		int x = 10;
//		int y = 4;
//		
//		double result2 = myCalc.divide(x, y); //
//		System.out.println("result2 = "+result2);
//		
//		myCalc.powerOff();
//	}
		
		Calculator myCalc = new Calculator();	
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCalc.areaRectangle(10,20);
		
		 System.out.println("정사각형 넓이: " + result1);
		 System.out.println("직사각형 넓이: " + result2);
	}
}


