package by.htp.hometask09;

public class Salad {

	public String makeSalad() {
		Tomato tom = new Tomato();
		tom.setCal(23);
		tom.setName("Помидор");
		Cucumber cuc = new Cucumber();
		cuc.setCal(13);
		cuc.setName("Огурец");
		Cabbage cab = new Cabbage();
		cab.setCal(14);
		cab.setName("Кабачок");
		Corn cor = new Corn();
		cor.setCal(29);
		cor.setName("Кукуруза");

		System.out.println("В салат вошли следующие ингридиенты: " + tom.getName() + ", " + cuc.getName() + ", "
				+ cab.getName() + ", " + cor.getName() + '.');

		int allcal;
		allcal = tom.getCal() + cuc.getCal() + cab.getCal() + cor.getCal();
		System.out.println("Общая калорийность салата составляет: " + allcal);
		
		Vegetable vegetable[] = new Vegetable[4];
		vegetable[0] = tom;
		vegetable[1] = cuc;
		vegetable[2] = cab;
		vegetable[3] = cor;

		bubbleSort(vegetable);
		
		System.out.print("Отсортированная калорийность овощей: ");
		for (int i = 0; i < vegetable.length; i++)
			//System.out.printf("%5d ", vegetable[i]);
			System.out.print(" " + vegetable[i].getCal());
		
		System.out.println(" ");
		
		for (int i = 0; i < vegetable.length; i++) {
			if ((vegetable[i].getCal() > 10) && (vegetable[i].getCal() < 20)) {
				System.out.println(vegetable[i].getName() + " " + vegetable[i].getCal() + " " +  "калорий.");
			}
		}
		return " ";
	}

	static void bubbleSort(Vegetable vegetable[]) {
		for (int i = vegetable.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (vegetable[j].getCal() > vegetable[j + 1].getCal()) {
					Vegetable t = vegetable[j];
					vegetable[j] = vegetable[j + 1];
					vegetable[j + 1] = t;
				}
			}
			//System.out.println(vegetable[i].getName());
		}
	}
}
