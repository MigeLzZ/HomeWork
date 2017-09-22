package by.htp.lsn13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Task1();
		//Task2();
		//Task3();
		//Task4();
		//Task5();
		//Task6();
		System.out.println(Task7("���� ����� ����� ����. ����� ����� � ���� ���. ����� � ���� ���� �����. ��� �� ���� ����� - ���.", "���"));
		
		/*String s1 = "Hello";
		
		String s2 = "Hello";
		
		String s3 = new String("Hello").intern();
		
		String s4 = "HelloWorld!";
		
		String s5 = s1 + "World!";
		String s55 = "World!";
		
		String s6 = s1.concat("World!").intern();
		
		String s7 = s1.concat(s55).intern();
		
		String s8 = "HelloWorld!";
		
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb2 = sb.append("World!");
		
		System.out.println(s4 == s5); */
		
	}

	// �1. � ������ ����� ������ k-� ����� �������� �������� ��������. 
	// ���� k ������ ����� �����, ������������� �� ���������.
	
	public static void Task1 () {
		String str = "���� ���� ������� �������";
		int k = 3;
        String temp;
        String[] words = str.split("[\\s\\.\\!\\,]");
        for(int i = 0; i < words.length; i++){
            System.out.print("");
 
            if(k < words[i].length()){
                temp = "";
                temp += words[i].substring(0, k-1);
                temp += '@';
                temp += words[i].substring(k,words[i].length());
 
                words[i] = temp;
            }
            System.out.print(" " + words[i]);
        }
	}
	
	// �2. � ������ ������ ����� �������� �� ���������� ������� � ��������. ���
	// ������ � ����� ������ �������� ����� � ����� ��������� ����� �������,
	// � ��������� ������ ����� ��� ������ ������ �������� �� �����.
	
	public static void Task2() {
		//�������������� ������ ���������
        String alphabet = "��������������������������������";
        //String alphabet =("abcdefghijklmnopqrstuvwxyz");
        
        //������ ���� �����
        String str1 = "";
        System.out.println("������� �����");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.nextLine();
        
        //����������� ������ � ������ char'��
        char[] charArray = str1.toCharArray();
        
        //������� � ������� ��������� ������� � ����� ���������
        for(int i = 0; i < str1.length(); i++){
            System.out.print(charArray[i] + "  ");
        }
        System.out.println("");
        
        //������� � ������� ����� ������� ����� � ��������
        for (char x : charArray){
        //���������� ������ ������� � �������� ������
            if(x == ' '){
                System.out.print("");
            } else {
            int i = alphabet.lastIndexOf(x);
            i+=1;
            System.out.print(i + "  ");
            } 
        }
	}
	
	// �3. � ������ ����� k-�� ������� �������� �������� ���������.
	
	public static void Task3() {
		int k = 8;
		String str = "���� ���� ����";
		StringBuilder sb = new StringBuilder(str);
		sb.insert(k, "lol");
		System.out.println(sb);
	}
	
	// �4. � ����������� �� �������� (0 ��� 1) � ������ ������ ������ ������� ���������
	// ������ �����, ��� �� �����������, ��� �������� ��� ����� k-�o �������.
	
	public static void Task4() {
		int k = 2;
		String str = "���� ���� ���� ���-�� ������ ��������";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("�������� ��������:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        switch(a) {
        	case 0:
        	    String str1 = str.replaceAll("�", ""); 		
        		System.out.println(str1);
        		break;
        	case 1:
        		sb.insert(k, "lol");
        		System.out.println(sb);
        		break;
        }
	}
	
	// �5. �� ������ ������� ��� �������, ����� ��������, �� ���������� �������. �����
	// �������������������� ������ ������ ���� �������� ���� �� ���� ������.
	
	public static void Task5() {
		//������ �����
        String text = "";
        System.out.println("������� �����");
        Scanner sc1 = new Scanner(System.in);
        text = sc1.nextLine();
        
        //����������� ����� � ������ char'��
        char[] charArray = text.toCharArray();
        
        //������� � ������ �� ������ ������� � ������� � ������� � 1 ��������
        for(char x : charArray){
            if(Character.isLetter(x)){
                System.out.print(x + " ");
            }
        }
	}
	
	// �6. ����������, ������� ��� ����������� � ������ ������ �����, ������� ����������� � ���.
	
	public static void Task6() {
		String fulltext = "������� ������ ������ ������ ������ ������ ������ ������";
        String[] words = fulltext.split(" ");
        Object[] wordsdistinct = unique(words);
        int i;
        for(Object distword: wordsdistinct)
        {
            i = 0;
            for(String oneword: words)
                if(oneword.equals(distword))
                    i++;
            System.out.println("�����:\"" + distword + "\" ����������� " + i + " ���(�)");
        }
	}
	
	private static Object[] unique(String[] arrayName)
    {
        ArrayList distinct = new ArrayList ();
        for(int i = 0; i < arrayName.length; i++ )
        {
            if(!distinct.contains(arrayName[i]))
                distinct.add(arrayName[i]);
        }
        return distinct.toArray();
    } 
	
	// �7. ����������, ������� ��� �������� ����� ������ � �����.
	
	public static int Task7(String message, String word) {
		message = message.toLowerCase();
		word = word.toLowerCase();
		int i = message.indexOf(word);
		int count = 0;
		while (i >= 0) {
			count++;
			i = message.indexOf(word, i + 1);
		}
		return count;
	}
}
