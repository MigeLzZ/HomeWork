// �10: ������ � ������� n ����� �����. �� ������� �������: ������� �����.
package com.it.hometask.HomeTask02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeTask10 {

	public static boolean isSimple(int m) {
        boolean simple = true;
        for (int i = 3; i <= Math.sqrt(m); i += 2) {
            if (m <= 1)
                return false;
            if (m == 2)
                return true;
            if (m % i == 0) {
                simple = false;
                break;
            }
        }
        return ((m % 2 != 0 && simple && m > 2) || m == 2);
    }
	
	public static void simpleNumbers(Integer[] sourceNumbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            if (isSimple(sourceNumber)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("������� �����: " + result);
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
        simpleNumbers(sourceNumbers);
	}

}
