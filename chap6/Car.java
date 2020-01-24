package chap6;

public class Car {
	private String color;
	private int speed;

	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public void downSpeed(int value) {
		speed = value - speed;
		if (speed >= 0)
			speed = value - speed;
		else
			speed = 0;

	}

	public void upSpeed(int value) {
		speed = value + speed;
		if (speed <= 300)
			speed = value + speed;
		else
			speed = 300;
	}

}