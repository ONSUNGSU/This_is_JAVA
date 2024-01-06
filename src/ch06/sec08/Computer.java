package ch06.sec08;

public class Computer {
	int sum(int ... values) { // ...매개변수의 갯수 상관없고, 배열도 상관없이 입력 가능
		int sum = 0;
		
		for (int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
}
