package chap6_02;

public class Student extends Person {
	protected String number;
	
	public Student(String name, int age, String number) {
		super(name, age);
		this.number = number;
	}

	public void show() {
		System.out.print("�л� ");
		System.out.printf("(�̸�=%s, ����=%d, �й�=%s)\n",name, age, number);
	}

}
