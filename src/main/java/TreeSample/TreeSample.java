package TreeSample;

public class TreeSample {
	public static void main(String args[]) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		
		System.out.println(TreeSample.height(node));
	}
	
	public static int height(Node root)
    {
        // base case: empty tree has a height of 0
        if (root == null) {
            return 0;
        }
 
        // recur for the left and right subtree and consider maximum depth
        return Math.max(1+height(root.left), 1+height(root.right));
    }


	
}

class Node{
	int value;
	Node left;
	Node right;
	
	Node(int value) {
		this.value = value;
	}
	
	public String toString() {
		return new Integer(value).toString();
	}
}