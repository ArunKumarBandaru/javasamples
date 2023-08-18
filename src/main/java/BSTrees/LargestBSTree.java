package BSTrees;

class MaintainNode {
	
	int maxValue;
	int minValue;
	int maxSize;
	
	MaintainNode(int maxValue, int minValue, int maxSize) {
		this.maxValue = maxValue;
		this.minValue = minValue;
		this.maxSize = maxSize;
	}
	
}

public class LargestBSTree {
	
	public static void main(String args[]) {
		
		Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);
        
        MaintainNode maintainNode = LargestBSTree(root);
        
        System.out.println(maintainNode.maxSize);
	}
	
	public static MaintainNode LargestBSTree(Node node) {
		
		if(node == null) return new MaintainNode(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
		
		MaintainNode left = LargestBSTree(node.left);
		MaintainNode right = LargestBSTree(node.right);
		
		if(left.maxValue <= node.data && right.minValue >= node.data) {
			//BST tree
			return new MaintainNode(Math.max(node.data, Integer.MIN_VALUE), 
					Math.min(Integer.MAX_VALUE, node.data), Math.max(left.maxSize, right.maxSize) + 1);
		}
		
		return new MaintainNode(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
	}
}
