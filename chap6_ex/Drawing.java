package chap6_ex;

public class Drawing {

	public void drawShape(Sape c) {
		c.draw();

	}

	public static void main(String[] args) {
		Drawing dw = new Drawing();
		//Triangle t = new Triangle();
		Sape s = new Triangle();
		
		dw.drawShape(s);
		s = new Circle();
		dw.drawShape(s);
		s = new Ractangel();
		//재사용. 다형성적용
	}

}
