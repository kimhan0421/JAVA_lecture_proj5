package chap6_02;

public class PersonTest {

	public static void main(String[] args) {
		Person p[] = new Person[3];
		p[0] = new Person("길동이", 22);
		p[1] = new Student("황진이", 23, "100");
		p[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");

		for (Person per : p) {
			per.show();

		}

	}

}
