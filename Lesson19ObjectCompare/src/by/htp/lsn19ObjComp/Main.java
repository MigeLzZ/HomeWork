package by.htp.lsn19ObjComp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[] {9, 8, 1, 15, 9, 25, 3};
		
		Arrays.sort(array);		
		printArray(array);
		
		// TODO sort by month natural order
		String[] sArray = new String[] {"March", "April", "May", "December", "September"};
		Arrays.sort(sArray);
		printArray(sArray);
		
		Person[] pArray = new Person[7];
		
		Person p1 = new Person(28, "Andrew", 500);
		Person p2 = new Person(103, "Max", 300);
		Person p3 = new Person(4, "Petya", 10);
		Person p4 = new Person(58, "George", 1300);
		Person p5 = new Person(63, "Mishel", 200);
		Person p6 = new Person(21, "Kate", 10000);
		Person p7 = new Person(21, "Kate", 2000);
		
		Person p8 = new Person(21, "Kate", 300);
		Person p9 = new Person(103, "Max", 1000);	
		
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		pArray[4] = p5;
		pArray[5] = p6;
		pArray[6] = p7;
		
		//Arrays.sort(pArray);
		//printArray(pArray);
		
		HashSet<Person> hashPerson = new HashSet<Person>();
		hashPerson.add(p1);
		hashPerson.add(p2);
		hashPerson.add(p3);
		hashPerson.add(p4);
		hashPerson.add(p5);
		hashPerson.add(p6);
		hashPerson.add(p7);
		hashPerson.add(p8);
		hashPerson.add(p9);
		
		/*for (Person p : hashPerson) {
			System.out.println(p + " " + p.hashCode());
		}*/
		
		LinkedHashSet<Person> linkedHashPerson = new LinkedHashSet<Person>();
		linkedHashPerson.add(p1);
		linkedHashPerson.add(p2);
		linkedHashPerson.add(p3);
		linkedHashPerson.add(p4);
		linkedHashPerson.add(p5);
		linkedHashPerson.add(p6);
		linkedHashPerson.add(p7);
		linkedHashPerson.add(p8);
		linkedHashPerson.add(p9);
		
		TreeSet<Person> treeSet = new TreeSet<Person>(new PersonNameAndSurnameInAlphabetOrder());
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
		treeSet.add(p6);
		treeSet.add(p7);
		treeSet.add(p8);
		treeSet.add(p9);
		
		for (Person p : treeSet) {
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getBankAmount());
		}
		
		System.out.println("");
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}
	
	public static void printArray(String[] array) {
		for (String s: array) {
			System.out.println(s);
		}
	}
	
	public static void printArray(Person[] array) {
		for (Person p: array) {
			System.out.println(p + " ");
		}
	}

}

class Person implements Comparable<Person>{
	private int age;
	private String name;
	private int bankAmount;

	public Person(int age, String name, int bankAmount) {
		super();
		this.age = age;
		this.name = name;
		this.bankAmount = bankAmount;
	}
	
	public Person(int age) {
		super();
		this.age = age;
	}
	
	public Person() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBankAmount() {
		return bankAmount;
	}

	public void setBankAmount(int bankAmount) {
		this.bankAmount = bankAmount;
	}

	@Override
	public String toString() {
		return "Person age: " + age;
	}

	@Override
	public int compareTo(Person p) {
		return this.getAge() - p.getAge();
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;*/
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

	/*@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.getAge() - p.getAge();
	}*/
}

class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p2.getAge() - p1.getAge();
	}
	
}

class PersonAgeAndBankAmountComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getAge() == p2.getAge()) {
			return p2.getBankAmount() - p1.getBankAmount();
		}
		return p2.getAge() - p1.getAge();
	}
	
}

class PersonNameAndSurnameInAlphabetOrder implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int compNames = p1.getName().compareTo(p2.getName());
		if (compNames != 0) {
			return compNames;
		} if (p2.getAge() == p1.getAge()) {
			return p2.getBankAmount() - p1.getBankAmount();
		}
		return p2.getAge() - p1.getAge();
	}
}
// Сортировать людей по возрасту и сумме на счёте, чем больше, тем он важнее.
// В алфавитном порядке по имени, затем по возрасту по возрастанию и по сумме на счётчик по убыванию.