package chap6;

public class TestCar {

	   public static void main(String[] args) {
	      Sedan sedan1 = new Sedan("����", 0, 5);
	      Truck truck1 = new Truck("���", 0, 50);

	      sedan1.upSpeed(150);
	      sedan1.downSpeed(200);
	      truck1.upSpeed(150);
	      truck1.upSpeed(200);

	      System.out.printf("�¿����� ������ %s, �ӵ��� %dkm, �¼����� %d�� �Դϴ�.\n", sedan1.getColor(), sedan1.getSpeed(),
	            sedan1.getSeatNum());
	      System.out.printf("Ʈ���� ������ %s, �ӵ��� %dkm, ���緮�� %d�� �Դϴ�.\n", truck1.getColor(), truck1.getSpeed(),
	            truck1.getCapacity());
	   }

	}
