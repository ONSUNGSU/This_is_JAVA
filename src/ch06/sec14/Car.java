package ch06.sec14;

public class Car {
	//필드
	private int speed; // 차량의 속도
	private boolean stop; // 브레이크 작동: boolean 초기값이 없다
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) { //음수 값이 대입하면
		if (speed<0) { // speed를 0으로 강제 설정
			this.speed = 0;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
