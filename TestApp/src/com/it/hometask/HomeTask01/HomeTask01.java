// �1: ��������������� ������, ��������� ����������� � ���������� ���� ���� ����� ����� � ���� �������������� ��������.
//     ��������� ��������� �������������� �������� ��� ��������� ������� � ��������� ������� �� �����.
package com.it.hometask.HomeTask01;

import java.util.Scanner;

public class HomeTask01 {

	static int scaner1() {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� x: ");
		int item1 = in.nextInt();
		return item1;
	}
	
	static int scaner2() {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� y: ");
		int item2 = in.nextInt();
		return item2;
	}
	
	static char scaner3() {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ���� (+,-,*,/): ");
		char item3 = in.next().charAt(0);
		return item3;
	}
	
	static void actions(int item1, int item2, char item3) {  
		int c;
		if (item3 == '+') {
			c = item1 + item2;
			System.out.println("��������� �������� ��������: " + c);
		} else if(item3 == '-') {
			c = item1 - item2;
			System.out.println("��������� �������� ���������: " + c);
		} else if(item3 == '*') {
			c = item1 * item2;
			System.out.println("��������� �������� ���������: " + c);
		} else if(item3 == '/') {
			c = item1 / item2;
			System.out.println("��������� �������� �������: " + c);
		}	
	}
	
	
	public static void main(String[] args) {
		int item1 = scaner1();
		int item2 = scaner2();
		char item3 = scaner3();
		actions(item1, item2, item3);
	}

}
