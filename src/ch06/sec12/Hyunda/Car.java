package ch06.sec12.Hyunda;

// 타이어는 다른 패키지에 있다. import를 통해 다른 패키지의 클래스를 이용할 수 있다.
import ch06.sec12.Hankook.SnowTire;
import ch06.sec12.Kumho.AllSeasonTire;

// import : 가져오다  export: 내보내다


public class Car {  // 자동차에 타이어를 장착
	
	//명시적 기입을 통해서 다른 패키지의 클래스를 이용할 수 있다. 
	// 명시적(패키지경로.클래스명)으로 객체 생성 가능
	ch06.sec12.Hankook.Tire tire1 = new ch06.sec12.Hankook.Tire();
	ch06.sec12.Kumho.Tire tire2 = new ch06.sec12.Kumho.Tire();
	
	
	// import된 클래스는 클래스명으로 객체 생성 가능
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}
