package ch05;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] int Array = null; // 배열은 객체 생성(new: 번지 할당)하여 사용
		//intArray[0] = 10 //NullPointerException 배열의 크기 선언이 안된 상태에서 사용할려니 에러 발생
		
		String str = null; // 참조 변수: 번지를 활용, 번지가 할당이 안된 경우
		//System.out.println("총 문자 수: "+ str.length() ); // NullPointerException
	}

}
