package ch07.sec05;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	public final void stop() { // 자식 클래스에서 stop 메서드를 수정하지 못하게 final
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
