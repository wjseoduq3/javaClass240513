package javaClass240513;

public class Student_Important {
	
	public Student_Important() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	public Student_Important(String name, String hakbun, int age, String grade, String address) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	
	public Student_Important(String name, String hakbun, int age, String grade) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
	}

	String name;
	String hakbun;
	int age;
	String grade;
	String address;

	public void printName() {  // void -> return 값이 없을 때 사용
		System.out.println("학생이름:"+this.name);
	}
	
	
	
	
}
