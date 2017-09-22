package by.htp.lsn17univers.entity;

public class Student extends Person{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6120317280827163860L;
	
	private Group group;
	public static String univer;
	public transient int avg;     // Живёт до сериализации, после - нет.
	
	static{                       // Первое обращение к памяти.
		univer = "BNTU";
	}

	public Student() {
		super();
	}

	public Student(String name, int age, Group group) {
		super(name, age);
		this.group = group;
		System.out.println("Student constructor");
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [group = " + group + ", toString() = " + super.toString() + "]" + univer + " " + avg;
	}
	
	

}
