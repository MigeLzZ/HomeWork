package by.htp.lsn18ht;

public class HomeTask {

	public static void main(String[] args) {
		List m1 = new List();
		m1.addBack(35.0);
		m1.addBack(7);
		m1.addBack("abracadabra");
		m1.addFront(3);
		
		m1.printList();
		System.out.println();
		
		m1.delEl(7);
		m1.delEl(5);
		m1.delEl(12);
		m1.delEl(3);
		
		m1.printList();
		System.out.println();
		
		//m1.addMiddle(4);
		//System.out.println();
	}
}

class ListElement<E> {
	ListElement next;                        // указатель на следующий элемент
	//ListElement last;                        // указатель на предыдущий элемент
	E data;                                  // данные
}

class List<E> {
	private ListElement head;                // указатель на первый элемент
	private ListElement tail;                // указатель на последний элемент
	
	void addFront(E data) {                  // добавить спереди
		ListElement a = new ListElement();   // создаём новый элемент
		a.data = data;                       // инициализируем данные
		                                     // указатель на следующий элемент автоматически инициализируется как null
		if(head == null) {                   // если список пуст               
			head = a;                        // то указываем ссылки начала и конца на новый элемент
			tail = a;                        // т.е. список теперь состоит из одного элемента
		} else {
			a.next = head;                   // иначе новый элемент теперь ссылается на "бывший" первый
			head = a;                        // а указатель на первый элемент теперь ссылается на новый элемент
		}
	}
	
	void addBack(E data) {                   // добавление в конец списка
		ListElement a = new ListElement();   // создаём новый элемент
		a.data = data;
		
		if(tail == null) {                   // если список пуст               
			head = a;                        // то указываем ссылки начала и конца на новый элемент
			tail = a;                        // т.е. список теперь состоит из одного элемента
		} else {
			tail.next = a;                   // иначе "старый" последний элемент теперь ссылается на новый
			tail = a;                        // а в указатель на последний элемент записываем адрес нового элемента
		}
	}
	
	/*void addMiddle(E data) {                 // добавление в середину списка
		ListElement a = new ListElement();   // tmp - вставляемый элемент
		ListElement tmp = new ListElement();
		a.data = data;
		tmp.data = data;
		
		tmp.next = a.next;
		tmp.next.last = tmp;
		tmp.last = a;
		a.next = tmp;
	}*/
	
	void printList() {                       // печать списка
		ListElement t = head;                // получаем ссылку на первый элемент
		while (t != null) {                  // пока элемент существует
			System.out.println(t.data + " ");   // печатаем его данные
			t = t.next;                         // и переключаемся на следующий
		}
	}
	
	void delEl(E data) {                     // удаление элемента
		if (head == null) {                  // если список пуст - 
			return;                          // ничего не делаем
		}
		
		if (head == tail) {                  // если список состоит из одного элемента
			head = null;                     // очищаем указатели начала и конца
			tail = null;
			return;                          // и выходим
		}
		
		if (head.data == data) {             // если первый элемент - тот, что нам нужен
			head = head.next;                // переключаем указатель начала на второй элемент
			return;                          // и выходим
		}
		
		ListElement t = head;                // иначе начинаем искать
		while (t.next != null) {             // пока следующий элемент существует
			if (t.next.data == data) {       // проверяем следующий элемент
				if (tail == t.next) {        // если он последний
					tail = t;                // то переключаем указатель на последний элемент на текущий
				}
				t.next = t.next.next;        // найденный элемент выкидываем
				return;                      // и выходим
			}
			t = t.next;                      // иначе ищем дальше
		}
	}
}