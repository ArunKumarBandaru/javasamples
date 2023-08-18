package TreeSample;

public class PreOrder {
	
	public static void main(String args[]) {
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		
		printPreOrder(node);
		
	}
	
	public static void printPreOrder(Node node) {
		if(node == null) return;
		System.out.println(node.value);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

}
