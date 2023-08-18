package TreeSample;

public class GivenSumPathTrueorFalse {
	public static void main(String args[]) {
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
				
		System.out.println(GivenSumPath(node , 11));
		
	}
	
	public static boolean GivenSumPath(Node node, int value) {
		return false;
	}
}
