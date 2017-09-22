package by.htp.oopbasics.run;

import by.htp.oopbasics.Person;
import by.htp.oopbasics.Student;  // Блинов, стр.126, задача Б, + наследование, + абстракция.
import by.htp.oopbasics.Teacher;
import by.htp.oopbasics.Worker;

public class MainApp {

	public static void main(String[] args) {
		
		/*Person p = new Person();
		p.setAge(32);
		p.setFio("Person Person1 Person11");
		System.out.println(p.getAge());
		System.out.println(p.getFio());*/
		
		Student st = new Student();
		st.setFio("Student Student1 Student11");
		st.setAge(20);
		st.setCourse("1-st course");

		System.out.println(st.getAge());
		System.out.println(st.getFio());
		System.out.println(st.getCourse());
		
		Teacher th = new Teacher();
		th.setFio("Teacher Teacher1 Teacher11");
		th.setAge(58);
		th.setExperience(20);
		
		System.out.println(th.getAge());
		System.out.println(th.getFio());
		System.out.println(th.getExperience());
		
		Worker wk = new Worker();
		wk.setFio("Worker Worker1 Worker11");
		wk.setAge(35);
		wk.setSpeciality("Driver");
		
		System.out.println(wk.getAge());
		System.out.println(wk.getFio());
		System.out.println(wk.getSpeciality());
		
		//Person [] persons = new Person[4];
		Person [] persons = new Person[3];
		
		/*persons[0] = p;
		persons[1] = st;
		persons[2] = th;
		persons[3] = wk;*/
		
		persons[0] = st;
		persons[1] = th;
		persons[2] = wk;
		
		Object obj[] = new Object[3];
		obj[0] = st;
		obj[1] = th;
		obj[2] = wk;
		
		for (Person person: persons) {
			
			if (person.getClass().equals(Student.class)){
				Student st1 = (Student)person;
				System.out.println(st1.doSmthStudent());
			} else if (person.getClass().equals(Teacher.class)) {
				Teacher th1 = (Teacher)person;
				System.out.println(th1.doSmthTeacher());
			} else if (person.getClass().equals(Worker.class)) {
				Worker wk1 = (Worker)person;
				System.out.println(wk1.doSmthWorker());
			} /*else if (person.getClass().equals(Person.class)) {
				System.out.println(person.doSmth());
			} */
		}
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].saySmth());
			
			System.out.println(persons[i].toString());
		}
	}

}
