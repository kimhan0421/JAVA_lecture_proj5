package chap6_ex2;

import java.util.Arrays;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		circles[0] = new Circle(6);
		circles[1] = new Circle(4);
		circles[2] = new Circle(2);
		Arrays.sort(circles);
		for(Circle c : circles) {
			System.out.println(c.toString());
		}

	}

}
