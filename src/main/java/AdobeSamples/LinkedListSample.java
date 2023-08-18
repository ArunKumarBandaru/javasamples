package AdobeSamples;

public class LinkedListSample {

	public static void main(String args[]) {
		Node node = new Node(1);
		Node forward =  node;
		for(int i=2;i<5;i++) {
			forward.next = new Node(i);
			forward = forward.next;
		}
		
		Node temp = node;
		int count = 0;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
			count++;
		}
		
		System.out.println(count);
	}
}


