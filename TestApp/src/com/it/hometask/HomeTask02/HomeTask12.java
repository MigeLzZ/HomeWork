// �12: ������ � ������� n ����� �����. �� ������� �������: ��� ���������� �����, � ���������� ������ ������� ��� ���������� ����.
package com.it.hometask.HomeTask02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeTask12 {

	private static void difDigits(Integer[] sourceNumbers) {
		String number;
		List<Integer> result = new ArrayList<Integer>();
		for (Integer sourceNumber : sourceNumbers) {
			number = sourceNumber.toString();
			if (number.length() == 3 && number.charAt(0) != number.charAt(1) && number.charAt(1) != number.charAt(2)
					&& number.charAt(0) != number.charAt(2)) {
				result.add(sourceNumber);
			}
		}
		System.out.println("��� ����������� �����, � ���������� ������ ������� ��� ���������� ����: " + result);
	}

	public static void main(String[] args) {
		System.out.print("������� ����� ����� ��� �����? ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 0) {
			System.out.print("�����.");
			System.exit(0);
		}
		Integer[] sourceNumbers = new Integer[n];
		System.out.print("������� ����� �����: ");
		for (int i = 0; i < n; i++) {
			sourceNumbers[i] = in.nextInt();
		}
		difDigits(sourceNumbers);
	}
}
