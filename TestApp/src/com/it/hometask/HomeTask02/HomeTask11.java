// �11: ������ � ������� n ����� �����. �� ������� �������: ��������, ������������� ������� �������� �� �������� �������.
package com.it.hometask.HomeTask02;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask11 {

    private static void bubble(Integer[] sourceNumbers) {
        Integer[] result = sourceNumbers.clone();
        boolean swapped = true;
        int j = 0;
        int temp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < result.length - j; i++) {
                if (Math.abs(result[i]) < Math.abs(result[i + 1])) {
                    temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        System.out.println("��������, ������������� ������� �������� �� �������� �������: " + Arrays.asList(result));
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
        bubble(sourceNumbers);
	}

}
