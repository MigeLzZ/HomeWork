package by.htp.lsn4;

public class Main2 {

public static void main(String[] args) {    // Найти определение МЕТОДА!11
		
		Flower flower1 = new Flower(35, "Rose"); // Ссылка = объект.
		Bud bud1 = new Bud(5.5, "Red");
		
		Petal[] petals1 = new Petal[3];
		petals1[0] = new Petal("Oval", "White");
		petals1[1] = new Petal("Oval", "White");
		petals1[2] = new Petal("Oval", "White");
		
		bud1.setPetals(petals1); // Передали ссылку на лепестки.
		
		//flower1.bud = bud1;
		flower1.setBud(bud1);
		
		System.out.println(flower1.flowerInfo());
		
		Flower flower2 = new Flower(40, "Tulip");
		Bud bud2 = new Bud(3.2, "Yellow");
		
		Petal[] petals2 = new Petal[10];
		for(int i = 0; i<10; i++) {
			petals2[i] = new Petal("Round", "Orange"); 
		}
		bud2.setPetals(petals2);
		//flower2.bud = bud2;
		flower2.setBud(bud2);
		
		System.out.println(flower2.flowerInfo());
		
		Flower flower3 = new Flower(25, "Camomile");
		System.out.println(flower3.flowerInfo());
		
		flower3.toBloom();
		System.out.println(flower3.flowerInfo());
	}

}
