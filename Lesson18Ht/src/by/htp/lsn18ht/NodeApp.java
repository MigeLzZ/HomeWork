package by.htp.lsn18ht;

public class NodeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node {
	// Содержимое текущего элемента списка.
	private int element;
	// Указатель на следующий элемент списка.
	private Node next;
	// Вывод содержимого текущего элемента.
	public int getElement(){
		return element;
	}
	// Установка содержимого для текущего элемента списка.
	public void setElement(int e){
		element = e;
	}
	// Получение указателя на следующий элемент списка.
	public Node getNext() {
		return next;
	}
	// Установка следующего элемента списка.
	public void setNext(Node n) {
		next = n;
	}
}
