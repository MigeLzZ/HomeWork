// �4: ������ � ���������� ������ �������� ������. ����������, � ������ ������ ���� ��������� ������ �����.
package com.it.hometask.HomeTask01;

import java.util.Scanner;

public class HomeTask04 {

	static String scaner1() {
		Scanner in = new Scanner(System.in);
		System.out.print("������� �������� ������ � ������� �����: ");
		String item1 = in.nextLine();
		return item1;
	}
	
	
	static void season(String item1) { 
		if (item1.equals("��������") || item1.equals("�������") || item1.equals("������")) {
			System.out.print("������ ����� ��������� � ������ ���� - �����.");
		} else if (item1.equals("�������") || item1.equals("������") || item1.equals("�������")) {
			System.out.print("������ ����� ��������� � ������ ���� - ����.");
		} else if (item1.equals("����") || item1.equals("������") || item1.equals("���")) {
			System.out.print("������ ����� ��������� � ������ ���� - �����.");
		} else if (item1.equals("����") || item1.equals("����") || item1.equals("������")) {
			System.out.print("������ ����� ��������� � ������ ���� - ����.");
		} else {
			System.out.print("�� ���-�� ����� �� ���!");
		}
	}
	
	public static void main(String[] args) {
		String item1 = scaner1();
		season(item1);
	}

}