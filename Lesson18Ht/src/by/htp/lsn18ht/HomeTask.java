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
	ListElement next;                        // ��������� �� ��������� �������
	//ListElement last;                        // ��������� �� ���������� �������
	E data;                                  // ������
}

class List<E> {
	private ListElement head;                // ��������� �� ������ �������
	private ListElement tail;                // ��������� �� ��������� �������
	
	void addFront(E data) {                  // �������� �������
		ListElement a = new ListElement();   // ������ ����� �������
		a.data = data;                       // �������������� ������
		                                     // ��������� �� ��������� ������� ������������� ���������������� ��� null
		if(head == null) {                   // ���� ������ ����               
			head = a;                        // �� ��������� ������ ������ � ����� �� ����� �������
			tail = a;                        // �.�. ������ ������ ������� �� ������ ��������
		} else {
			a.next = head;                   // ����� ����� ������� ������ ��������� �� "������" ������
			head = a;                        // � ��������� �� ������ ������� ������ ��������� �� ����� �������
		}
	}
	
	void addBack(E data) {                   // ���������� � ����� ������
		ListElement a = new ListElement();   // ������ ����� �������
		a.data = data;
		
		if(tail == null) {                   // ���� ������ ����               
			head = a;                        // �� ��������� ������ ������ � ����� �� ����� �������
			tail = a;                        // �.�. ������ ������ ������� �� ������ ��������
		} else {
			tail.next = a;                   // ����� "������" ��������� ������� ������ ��������� �� �����
			tail = a;                        // � � ��������� �� ��������� ������� ���������� ����� ������ ��������
		}
	}
	
	/*void addMiddle(E data) {                 // ���������� � �������� ������
		ListElement a = new ListElement();   // tmp - ����������� �������
		ListElement tmp = new ListElement();
		a.data = data;
		tmp.data = data;
		
		tmp.next = a.next;
		tmp.next.last = tmp;
		tmp.last = a;
		a.next = tmp;
	}*/
	
	void printList() {                       // ������ ������
		ListElement t = head;                // �������� ������ �� ������ �������
		while (t != null) {                  // ���� ������� ����������
			System.out.println(t.data + " ");   // �������� ��� ������
			t = t.next;                         // � ������������� �� ���������
		}
	}
	
	void delEl(E data) {                     // �������� ��������
		if (head == null) {                  // ���� ������ ���� - 
			return;                          // ������ �� ������
		}
		
		if (head == tail) {                  // ���� ������ ������� �� ������ ��������
			head = null;                     // ������� ��������� ������ � �����
			tail = null;
			return;                          // � �������
		}
		
		if (head.data == data) {             // ���� ������ ������� - ���, ��� ��� �����
			head = head.next;                // ����������� ��������� ������ �� ������ �������
			return;                          // � �������
		}
		
		ListElement t = head;                // ����� �������� ������
		while (t.next != null) {             // ���� ��������� ������� ����������
			if (t.next.data == data) {       // ��������� ��������� �������
				if (tail == t.next) {        // ���� �� ���������
					tail = t;                // �� ����������� ��������� �� ��������� ������� �� �������
				}
				t.next = t.next.next;        // ��������� ������� ����������
				return;                      // � �������
			}
			t = t.next;                      // ����� ���� ������
		}
	}
}