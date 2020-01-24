package chap6_02;

public class Student extends Person {
	protected String number;
	
	public Student(String name, int age, String number) {
		super(name, age);
		this.number = number;
	}

	public void show() {
		System.out.print("학생 ");
		System.out.printf("(이름=%s, 나이=%d, 학번=%s)\n",name, age, number);
	}

}
