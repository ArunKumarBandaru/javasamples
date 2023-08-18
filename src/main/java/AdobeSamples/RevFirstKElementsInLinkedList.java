package AdobeSamples;

public class RevFirstKElementsInLinkedList {
	
	public static void main(String args[]) {
		int k = 7;
		Node node = new Node(1);
		Node forward =  node;
		for(int i=2;i<10;i++) {
			forward.next = new Node(i);
			forward = forward.next;
		}
		Node head = node; 
		
		Node currentNode = node;
		Node nextNode = currentNode.next;
		int countValue = 0;
		Node prev = null;
		while(countValue < k) {
			currentNode.next = prev;
			prev = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
			countValue++;
		}
		currentNode.next = prev;
		head.next = nextNode;
		Node temp = currentNode;
		
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
}
