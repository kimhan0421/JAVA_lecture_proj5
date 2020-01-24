package chap6;

public class Truck extends Car {
	private int capacity;

	public Truck(String color, int speed, int capacity) {
		super(color, speed);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

}