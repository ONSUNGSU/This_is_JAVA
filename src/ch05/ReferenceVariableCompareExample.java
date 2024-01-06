package ch05;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1; // 배열 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1 , 2 , 3}; // 배열 객체 생성 arr1 1,2,3
		arr2 = new int[] {1 , 2 , 3}; // 배열 객체 생성 arr2 1,2,3
		arr3 = arr2; // arr2 값을 arr3에 저장
		
		System.out.println(arr1 == arr2);
		// arr1, arr2는 같지 않다.
		// 객체를 생성시 메모리 주소를 할당(생성시에는 주소를 새롭게 등록)
		
		System.out.println(arr2 == arr3);
		// arr2, arr3는 같다.
		// arr2 객체를 arr3 변수에 담는 행위: 주소 번지를 담게
		// arr2 주소와 arr3의 주소가 같다.
	}

}
