package by.htp.lsn18ht;

public class NodeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node {
	// ���������� �������� �������� ������.
	private int element;
	// ��������� �� ��������� ������� ������.
	private Node next;
	// ����� ����������� �������� ��������.
	public int getElement(){
		return element;
	}
	// ��������� ����������� ��� �������� �������� ������.
	public void setElement(int e){
		element = e;
	}
	// ��������� ��������� �� ��������� ������� ������.
	public Node getNext() {
		return next;
	}
	// ��������� ���������� �������� ������.
	public void setNext(Node n) {
		next = n;
	}
}
