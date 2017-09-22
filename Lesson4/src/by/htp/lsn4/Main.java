package by.htp.lsn4;

public class Main {

	public static void main(String[] args) {
		
		Flower flower1 = new Flower(); // —сылка = объект.
		//flower1.height = 35;
		//flower1.title = "Rose";
		
		flower1.setHeight(35);
		flower1.setTitle("Rose");
		
		Bud bud1 = new Bud();
		bud1.setColor("red");;
		bud1.setSize(5.5);
		
		Petal petal1 = new Petal("Oval", "White");
		Petal petal2 = new Petal("Oval", "White");
		//Petal petal3 = new Petal("Oval", "White");
		
		Petal[] petals1 = new Petal[3];
		petals1[0] = petal1;
		petals1[1] = petal2;
		petals1[2] = new Petal("Oval", "White");
		
		bud1.setPetals(petals1); // ѕередали ссылку на лепестки.
		
		//flower1.bud = bud1;
		flower1.setBud(bud1);
		
		/* System.out.println(flower1.height + " " + flower1.title + " " + flower1.bud.getSize() + " " + flower1.bud.getColor());
		System.out.println(flower1.bud.getPetals()[0].getShape() + " " + flower1.bud.getPetals()[0].getColor()); // getPetals возвращает ссылку на массив и берЄт из него пустой элемент.
		System.out.println(flower1.bud.getPetals()[1].getShape() + " " + flower1.bud.getPetals()[1].getColor());
		System.out.println(flower1.bud.getPetals()[2].getShape() + " " + flower1.bud.getPetals()[2].getColor()); */
		
		Flower flower2 = new Flower();
		//flower2.height = -1;
		//flower2.title = "Tulip";
		
		flower2.setHeight(-1);
		flower2.setTitle("Tulip");
		
		Bud bud2 = new Bud();
		bud2.setColor("yellow");;
		bud2.setSize(3.2);
		
		Petal[] petals2 = new Petal[10];
		for(int i = 0; i<10; i++) {
			petals2[i] = new Petal("round", "orange"); 
		}
		bud2.setPetals(petals2);
		//flower2.bud = bud2;
		flower2.setBud(bud2);
		
		/* System.out.println(flower2.height + " " + flower2.title + " " + flower2.bud.getSize() + " " + flower2.bud.getColor());
		for (int i = 0; i < 10; i++) {
			System.out.println(flower2.bud.getPetals()[i].getShape() + " " + flower2.bud.getPetals()[i].getColor());
		} */
	}

}
