package chap6_02;

public class Person {
	protected String name;
	protected int age;
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.print("��� ");
		System.out.printf("(�̸�=%s, ����=%d)\n",name, age);
	}


}
