// �1: �������� ���������, ������� ����������� � ���������� ���� ������ ������
//     � �� ������ ������ �������� �������� ������� ������. ��������� �����������
//     ���� ������ ������ �� ��� ���, ���� ������������ �� ����� ������ 'q'.
//     ��� ������ ������ �� ������ ������������ �������� switch.
package com.it.app;

import java.util.Scanner;

public class MainApp2 {

	static String scaner1() {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� ������: ");
		String item1 = in.nextLine();
		return item1;
	}

	static void season(String item1) {

		switch (item1) {
		case "1":
			System.out.println("������.");
			break;
		case "2":
			System.out.println("�������.");
			break;
		case "3":
			System.out.println("����.");
			break;
		case "4":
			System.out.println("������.");
			break;
		case "5":
			System.out.println("���.");
			break;
		case "6":
			System.out.println("����.");
			break;
		case "7":
			System.out.println("����.");
			break;
		case "8":
			System.out.println("������.");
			break;
		case "9":
			System.out.println("��������.");
			break;
		case "10":
			System.out.println("�������.");
			break;
		case "11":
			System.out.println("������.");
			break;
		case "12":
			System.out.println("�������.");
			break;
		case "q" :
			System.out.println("�� ��������!");
			System.exit(0);
		default:
			System.out.println("������ ������ ������ �� ����������. ������� ���������� �����!");
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
		 * //�1: for(int i = 1; i < 6; i++){ System.out.println("Hello" + i); }
		 * 
		 * //�2: int a = 0; while(a < 6){ System.out.println("World" + a); a++;
		 * }
		 * 
		 * // �3: ���� do-while ���������� ���� �� 1 ���. int b = 0; do {
		 * System.out.println("Java" + b); b++; } while(b < 6);
		 * 
		 * //�4: int x = 2; char c = 'a'; switch(c){ case 'a':
		 * System.out.println(1); break; case 'b': System.out.println(2); break;
		 * default: System.out.println(0); }
		 */
	}
}
