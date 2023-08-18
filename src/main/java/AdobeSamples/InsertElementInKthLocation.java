package AdobeSamples;

public class InsertElementInKthLocation {
	
	public static void main(String args[]) {
		Node node = new Node(1);
		Node forward =  node;
		for(int i=2;i<10;i++) {
			forward.next = new Node(i);
			forward = forward.next;
		}
		
		int k = 5;
		int count = 0;
		Node temp = node;
		while(count < k) {
			count++;
			temp = temp.next;
		}
		
		Node newNode = new Node(8);
		
		newNode.next = temp.next;
		temp.next = newNode;
		Node tempSample = node;
		while(tempSample != null) {
			System.out.println(tempSample.value);
			tempSample = tempSample.next;
		}
	}
}
