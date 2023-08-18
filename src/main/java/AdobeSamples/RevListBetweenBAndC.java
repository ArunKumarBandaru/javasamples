package AdobeSamples;

public class RevListBetweenBAndC {
	
	public static void main(String args[]) {
		
		Node node = new Node(1);
		Node forward =  node;
		for(int i=2;i<5;i++) {
			forward.next = new Node(i);
			forward = forward.next;
		}
		
		int B = 2;
		int C = 4;
		
		
	}
}
