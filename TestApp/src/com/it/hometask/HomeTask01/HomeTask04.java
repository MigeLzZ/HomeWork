// №4: Ввести с клавиатуры полное название месяца. Определить, к какому сезону года относится данный месяц.
package com.it.hometask.HomeTask01;

import java.util.Scanner;

public class HomeTask04 {

	static String scaner1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите название месяца с большой буквы: ");
		String item1 = in.nextLine();
		return item1;
	}
	
	
	static void season(String item1) { 
		if (item1.equals("Сентябрь") || item1.equals("Октябрь") || item1.equals("Ноябрь")) {
			System.out.print("Данный месяц относится к сезону года - Осень.");
		} else if (item1.equals("Декабрь") || item1.equals("Январь") || item1.equals("Февраль")) {
			System.out.print("Данный месяц относится к сезону года - Зима.");
		} else if (item1.equals("Март") || item1.equals("Апрель") || item1.equals("Май")) {
			System.out.print("Данный месяц относится к сезону года - Весна.");
		} else if (item1.equals("Июнь") || item1.equals("Июль") || item1.equals("Август")) {
			System.out.print("Данный месяц относится к сезону года - Лето.");
		} else {
			System.out.print("Вы что-то ввели не так!");
		}
	}
	
	public static void main(String[] args) {
		String item1 = scaner1();
		season(item1);
	}

}