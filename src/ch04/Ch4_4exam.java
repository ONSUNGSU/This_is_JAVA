package ch04;

public class Ch4_4exam {

	public static void main(String[] args) throws InterruptedException{
		
		for(int i = 10; i>=0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
			
		}
		System.out.println("발사!");
	}

}
