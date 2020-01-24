package chap6_ex2;

public class Circle implements Comparable {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override // 써클 객체들의 소팅이 필요하다.Comparable클래스 사용. 현재 객체와 전달받은 변수를 비교해서 현재가 작으면 음수.
	public int compareTo(Object o) {
		Circle c = null;
		if (o instanceof Circle) {
			c = (Circle) o;
		} // 형변환
		return this.radius - c.radius;

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
