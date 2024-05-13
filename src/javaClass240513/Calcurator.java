package javaClass240513;

public class Calcurator {
	
	// public Calcurator() {
	// } 기본생성자가 생략되었음.
	// 속성 혹은 필드, 멤버변수
	int firstNum;  
	int secondNum;
	
	// 메소드(함수)
	// 파이썬 def add(firstNum, secondNum):
	//			return firstNum + secondNum
	
	public int add(int first, int second) {
		return first + second;
	}
	
	public int sub(int first, int second) {
		return first - second;
	}
	
	public int mul(int first, int second) {
		return first * second;
	}
	
	public int div(int first, int second) {
		return first / second;
	}
	
	public int pow(int number) {
		return number*number;
	}
	// 메소드 오버로딩
	public int pow(int number, int number2) {
		return number*number*number2;
	}
	
	
	
}
