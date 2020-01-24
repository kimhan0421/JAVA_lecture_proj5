package chap6;

public class TestCar {

	   public static void main(String[] args) {
	      Sedan sedan1 = new Sedan("레드", 0, 5);
	      Truck truck1 = new Truck("블루", 0, 50);

	      sedan1.upSpeed(150);
	      sedan1.downSpeed(200);
	      truck1.upSpeed(150);
	      truck1.upSpeed(200);

	      System.out.printf("승용차의 색상은 %s, 속도는 %dkm, 좌석수는 %d개 입니다.\n", sedan1.getColor(), sedan1.getSpeed(),
	            sedan1.getSeatNum());
	      System.out.printf("트럭의 색상은 %s, 속도는 %dkm, 적재량은 %d톤 입니다.\n", truck1.getColor(), truck1.getSpeed(),
	            truck1.getCapacity());
	   }

	}
