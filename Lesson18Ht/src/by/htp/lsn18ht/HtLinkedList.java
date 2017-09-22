package by.htp.lsn18ht;

public class HtLinkedList {

	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.addFirst(2);
		mll.addLast(6);
		mll.addFirst(5);
		mll.addFirst(10);
		mll.remove(10);
		//mll.removeFirst();
		//mll.removeLast();
		mll.toString();
		System.out.println(mll);

	}

}

class MyLinkedList<E> {
	 Node<E> first;
	 Node<E> last;
	 int size;
	 
	 public int size() {
	  return size;
	 }
	 
	 public void addFirst(E element) {
	  Node<E> node = new Node<E>(null, element, first);
	  if(first == null) {
	   last = node;
	  } else {
	   first.prev = node;
	  }
	  first = node;
	  size++;
	 }
	 
	 public void addLast(E element) {
	  Node<E> node = new Node<E>(last, element, null);
	  if (last == null) {
	   first = node;
	  } else {
	   last.next = node;
	  }
	  last = node;
	  size++;
	 }
	 
	 public E removeFirst() {
	  E element = null;
	  if (first == null) {   
	  } else if (first.next == null) {
	   element = first.element;
	   first = null;
	   last = null;
	  } else {
	   element = first.element;
	   first = first.next;
	   first.prev = null;
	  }
	  size--;
	  return element;
	 }
	 
	 public E removeLast() {
	  E element = null;
	  if (last == null) {   
	  } else if(last.prev == null) {
	   element = last.element;
	   first = null;
	   last = null;
	  } else {
	   element = last.element;
	   last = last.prev;
	   last.next = null;
	  }
	  size--;
	  return element;
	 }
	 
	 public boolean remove(E element) {
	  boolean flag = false;
	  if(first == null) {
	   return flag;
	  }
	  Node<E> node = first;     
	  while(node != null) {     
	   if((element == null && node.element == null) || (node.element != null && node.element.equals(element))) {      
	    if (node == first) {
	     removeFirst();
	     node = first; 
	     continue;
	    } else if (node == last) {
	     removeLast();
	     break;
	    } else {
	     node.prev.next = node.next;
	     node.next.prev = node.prev;      
	     size--;      
	    }
	    flag = true;
	   }   
	   node = node.next;  
	  }
	  return flag;
	 }
	 
	 static class Node<E> {
	  E element;
	  Node<E> next;
	  Node<E> prev;   
	  
	  Node(Node<E> prev, E elements, Node<E> next) {
	   super();
	   this.element = elements;
	   this.next = next;
	   this.prev = prev;
	  }  
	 }

	 @Override
	 public String toString() {
	  if (first == null) {
	   return "[]";
	  }
	  String s = "[";
	  Node<E> node = first;
	  while(node != null) {
	   s += (node.element + ", ");
	   node = node.next;
	  }
	  s = s.substring(0, s.length()-2);
	  s += "]";  
	  return s;
	 } 
	}