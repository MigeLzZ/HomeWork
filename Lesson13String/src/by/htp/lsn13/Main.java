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
		System.out.println(Task7("Ехал Грека через реку. Видит Грека в реке рак. Сунул в реку руку Грека. Рак за руку Греку - цап.", "Рак"));
		
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

	// №1. В каждом слове текста k-ю букву заменить заданным символом. 
	// Если k больше длины слова, корректировку не выполнять.
	
	public static void Task1 () {
		String str = "мама папа бабушка дедушка";
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
	
	// №2. В тексте каждую букву заменить ее порядковым номером в алфавите. При
	// выводе в одной строке печатать текст с двумя пробелами между буквами,
	// в следующей строке внизу под каждой буквой печатать ее номер.
	
	public static void Task2() {
		//Инициализируем строку алфавитом
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        //String alphabet =("abcdefghijklmnopqrstuvwxyz");
        
        //Вводим свой текст
        String str1 = "";
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.nextLine();
        
        //Преобразуем строку в массив char'ов
        char[] charArray = str1.toCharArray();
        
        //Выводим в консоль введенные символы с двумя пробелами
        for(int i = 0; i < str1.length(); i++){
            System.out.print(charArray[i] + "  ");
        }
        System.out.println("");
        
        //Выводим в консоль номер позиции буквы в алфавите
        for (char x : charArray){
        //Игнорируем символ пробела в веденном тексте
            if(x == ' '){
                System.out.print("");
            } else {
            int i = alphabet.lastIndexOf(x);
            i+=1;
            System.out.print(i + "  ");
            } 
        }
	}
	
	// №3. В тексте после k-го символа вставить заданную подстроку.
	
	public static void Task3() {
		int k = 8;
		String str = "Мама мыла раму";
		StringBuilder sb = new StringBuilder(str);
		sb.insert(k, "lol");
		System.out.println(sb);
	}
	
	// №4. В зависимости от признака (0 или 1) в каждой строке текста удалить указанный
	// символ везде, где он встречается, или вставить его после k-гo символа.
	
	public static void Task4() {
		int k = 2;
		String str = "Мама мыла раму где-то далеко наверное";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Выберите действие:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        switch(a) {
        	case 0:
        	    String str1 = str.replaceAll("а", ""); 		
        		System.out.println(str1);
        		break;
        	case 1:
        		sb.insert(k, "lol");
        		System.out.println(sb);
        		break;
        }
	}
	
	// №5. Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
	// последовательностями подряд идущих букв оставить хотя бы один пробел.
	
	public static void Task5() {
		//Вводим текст
        String text = "";
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        text = sc1.nextLine();
        
        //Преобразуем текст в массив char'ов
        char[] charArray = text.toCharArray();
        
        //Удаляем в тексте не нужные символы и выводим в консоль с 1 пробелом
        for(char x : charArray){
            if(Character.isLetter(x)){
                System.out.print(x + " ");
            }
        }
	}
	
	// №6. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
	
	public static void Task6() {
		String fulltext = "конфета яблоко дерево дерево дерево машина яблоко машина";
        String[] words = fulltext.split(" ");
        Object[] wordsdistinct = unique(words);
        int i;
        for(Object distword: wordsdistinct)
        {
            i = 0;
            for(String oneword: words)
                if(oneword.equals(distword))
                    i++;
            System.out.println("Слово:\"" + distword + "\" встречается " + i + " раз(а)");
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
	
	// №7. Подсчитать, сколько раз заданное слово входит в текст.
	
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
