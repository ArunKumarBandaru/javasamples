package AdobeSamples;

public class RevLinkedListSample {
	public static void main(String args[]) {
		class Node {
			int value;
			Node next;
			Node(){
			}
			Node(int value) {
				this.value = value;
			}
		}
		Node node = new Node(1);
		Node forward =  node;
		for(int i=2;i<10;i++) {
			forward.next = new Node(i);
			forward = forward.next;
		}
		// reverse the linked-list sample
		Node prev = null;
		Node currentNode = node;
		Node nextNode = null;
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = nextNode;
		}
		//currentNode.next = prev;
		//currentNode = prev;
		
		Node tempNode = prev;
		while(tempNode != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
	}
}


