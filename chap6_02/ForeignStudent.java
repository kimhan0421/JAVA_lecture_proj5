package chap6_02;

public class ForeignStudent extends Student {
	protected String nation;
	
	public ForeignStudent(String name, int age, String number, String nation) {
		super(name, age, number);
		this.nation = nation;
	}

	public void show() {
		System.out.print("외국학생 ");
		System.out.printf("(이름=%s, 나이=%d, 학번=%s, 국적=%s)\n",name, age, number,nation);
	}
}
