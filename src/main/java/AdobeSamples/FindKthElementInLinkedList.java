package AdobeSamples;

public class FindKthElementInLinkedList {
	public static void main(String args[]) {
		Node node = new Node(1);
		Node forward =  node;
		for(int i=2;i<10;i++) {
			forward.next = new Node(i);
			forward = forward.next;
		}
		int k = 0;
		Node temp = node;
		int count = 0;
		while(count < k) {
			//System.out.println(temp.value);
			temp = temp.next;
			count++;
		}
		
		System.out.println(temp.value);
	}
}
