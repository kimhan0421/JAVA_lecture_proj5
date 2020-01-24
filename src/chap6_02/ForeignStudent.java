package chap6_02;

public class ForeignStudent extends Student {
	protected String nation;
	
	public ForeignStudent(String name, int age, String number, String nation) {
		super(name, age, number);
		this.nation = nation;
	}

	public void show() {
		System.out.print("�ܱ��л� ");
		System.out.printf("(�̸�=%s, ����=%d, �й�=%s, ����=%s)\n",name, age, number,nation);
	}
}
