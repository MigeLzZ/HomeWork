package by.htp.lsn5;

public class Main {

	public static void main(String[] args) {
		Bird bird1 = new Bird("Pigeon", "Herbivorous", "Blue-green", null, null);
		Wing wing1 = new Wing(10, 500);
		Beak beak1 = new Beak(2, "Flat");
		
		bird1.setWing(wing1);
		bird1.setBeak(beak1);
		
		System.out.println(bird1.birdInfo());
		
		bird1.toFly();
		bird1.toSit();
		bird1.toEat();
		bird1.toAtack();
		System.out.println(bird1.birdInfo());
		
		Bird bird2 = new Bird("Eagle", "Predator", "Brown-White", null, null);
		Wing wing2 = new Wing(24, 1234);
		Beak beak2 = new Beak(10, "Sharp");
		
		bird2.setWing(wing2);
		bird2.setBeak(beak2);
		
		System.out.println(bird2.birdInfo());
		
		bird2.toFly();
		bird2.toSit();
		bird2.toEat();
		bird2.toAtack();
		System.out.println(bird2.birdInfo());
		
		Bird bird3 = new Bird("Flamingo", "Herbivorous", "Pink", null, null);
		Wing wing3 = new Wing(45, 1400);
		Beak beak3 = new Beak(11, "Sharp");
		
		bird3.setWing(wing3);
		bird3.setBeak(beak3);
		
		System.out.println(bird3.birdInfo());
		
		bird3.toFly();
		bird3.toSit();
		bird3.toEat();
		bird3.toAtack();
		System.out.println(bird3.birdInfo());
	}

}
