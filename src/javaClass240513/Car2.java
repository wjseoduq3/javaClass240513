package javaClass240513;

public class Car2 {
	
	public Car2() { }// 기본생성자
		
	
	public Car2(String company,	String model, String color,	int maxspeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	public Car2(String company,	String model, int maxspeed) {
		this.company = company;
		this.model = model;
		this.maxspeed = maxspeed;
	}
	
		String company;
		String model;
		String color;
		int maxspeed;
		Car car;  // 다른 클래스로 만든 객체도 필드로 사용 가능 

}
