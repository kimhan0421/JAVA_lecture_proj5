package chap6_ex2;

public class Circle implements Comparable {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override // ��Ŭ ��ü���� ������ �ʿ��ϴ�.ComparableŬ���� ���. ���� ��ü�� ���޹��� ������ ���ؼ� ���簡 ������ ����.
	public int compareTo(Object o) {
		Circle c = null;
		if (o instanceof Circle) {
			c = (Circle) o;
		} // ����ȯ
		return this.radius - c.radius;

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
