package javaClass240513;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
//		int b;
//		Calcurator cal1 = new Calcurator();
		// Calcurator 클래스로 new 연산자를 사용하여 cal1 객체를 생성	
		// Calcurator cal2 = new Calcurator();
//		a = cal1.add(100, 200);
//		System.out.println(a);
//		
//		b = cal1.pow(10);
//		System.out.println(b);
		
		// Car 실습
//		Car car = new Car(4);
//		
//		System.out.println(car.company);
//		car.speed = 150;		
//		System.out.println(car.speed);
//		car.version = "HG";
//		System.out.println(car.version);
//		
//		System.out.println(car.price[0]);
//		System.out.println(car.price[1]);
//		System.out.println(car.price);	// memory 주소 찍힘
//		System.out.println(car.tire);
		
		Car2 car2 = new Car2("기아자동차","K9","red",220);
					
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxspeed);
		
		
		Car2 car3 = new Car2("기아자동차","K9",220);
		
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.maxspeed);
		
		Test test = new Test();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		System.out.println(test.sum1(arrTest));
		
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		Worker worker1 = new Worker("홍길동", 26, "010-7112-7777", "서울 광진구");
		System.out.println(worker1.age);
	}

}
