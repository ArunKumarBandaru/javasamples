package TreeSample;

public class BinarySearchTree {
	public static void main(String args[]) {
		Node node = new Node(2);
		node.left = new Node(1);
		node.right = new Node(3);
		
		int k = 3;
		searchanElement(node,  k);
	}
	
	public static void searchanElement(Node node, int k) {
		if(node == null) return;
		if(node.value == k ) {
			System.out.println("value found in the console :: "+k);
		} else if(node.value > k) {
			searchanElement(node.left, k);
		} else {
			searchanElement(node.right , k);
		}
	}
}
