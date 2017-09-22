// є1: Ќаписать программу, котора€ запрашивает с клавиатуры ввод номера мес€ца
//     и по номеру мес€ца печатает название данного мес€ца. ѕрограмма запрашивает
//     ввод номера мес€ца до тех пор, пока пользователь не введЄт символ 'q'.
//     ƒл€ выбора мес€ца по номеру использовать оператор switch.
package com.it.app;

import java.util.Scanner;

public class MainApp2 {

	static String scaner1() {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите номер мес€ца: ");
		String item1 = in.nextLine();
		return item1;
	}

	static void season(String item1) {

		switch (item1) {
		case "1":
			System.out.println("январь.");
			break;
		case "2":
			System.out.println("‘евраль.");
			break;
		case "3":
			System.out.println("ћарт.");
			break;
		case "4":
			System.out.println("јпрель.");
			break;
		case "5":
			System.out.println("ћай.");
			break;
		case "6":
			System.out.println("»юнь.");
			break;
		case "7":
			System.out.println("»юль.");
			break;
		case "8":
			System.out.println("јвгуст.");
			break;
		case "9":
			System.out.println("—ент€брь.");
			break;
		case "10":
			System.out.println("ќкт€брь.");
			break;
		case "11":
			System.out.println("Ќо€брь.");
			break;
		case "12":
			System.out.println("ƒекабрь.");
			break;
		case "q" :
			System.out.println("ƒо свидани€!");
			System.exit(0);
		default:
			System.out.println("“акого номера мес€ца не существует. ¬ведите правильный номер!");
			break;
		}
	}

	public static void main(String[] args) {
		String item1;
		do {
			item1 = scaner1();
			season(item1);
		} while (item1.equals(item1));

		/*
		 * //є1: for(int i = 1; i < 6; i++){ System.out.println("Hello" + i); }
		 * 
		 * //є2: int a = 0; while(a < 6){ System.out.println("World" + a); a++;
		 * }
		 * 
		 * // є3: ÷икл do-while выполнитс€ хот€ бы 1 раз. int b = 0; do {
		 * System.out.println("Java" + b); b++; } while(b < 6);
		 * 
		 * //є4: int x = 2; char c = 'a'; switch(c){ case 'a':
		 * System.out.println(1); break; case 'b': System.out.println(2); break;
		 * default: System.out.println(0); }
		 */
	}
}
