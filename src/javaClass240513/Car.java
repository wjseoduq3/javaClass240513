package javaClass240513;

public class Car {
	
	public Car(int tire) {  // 생성자는 반환타입이 없음 --> 쓰면 안됨
					// 생성자는 클래스와 동일한 이름을 메소드로 사용해야 됨
		System.out.println("생성자호출!");
		System.out.println("타이어수:"+tire);
		this.tire = tire;  // this : 파이썬 self와 같은 역활
	}
	
	
	int tire;
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	String version ="";
	int maxspeed = 350;
	int speed;
	
	int[] price = {1000,2000};	
}
