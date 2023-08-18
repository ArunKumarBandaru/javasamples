package Java;

public class RevLinkedList {
	public static void main(String args[]) {
		Node head = null;
		Node temp = new Node(0);
		
		head = temp;
		
		for(int i=1;i<10;i++) {
			temp.next = new Node(i);
			temp = temp.next;
		}
		
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		System.out.println(current.next.value);
	}
}


class Node {
	int value;
	Node next;
	
	Node(int value) {
		this.value = value;
	}
}