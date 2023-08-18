package TreeSample;

public class LowestCommonAncestor {
	
	public static void main(String args[]) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
				
		System.out.println(LowestCommonAncestor.LCA(node, 6, 7));
	}
	
	//Least common ancestor
	
	public static int LCA(Node node, int startValue, int endValue) {
		if(node == null) return 0;
		
		//if(node.left == null && node.right == null) return 0;
		
		if(node.value == startValue || node.value == endValue) return node.value;
		
		int leftvalue = LCA(node.left, startValue, endValue);
		int rightvalue = LCA(node.right, startValue, endValue);
		
		if(leftvalue != 0 && rightvalue != 0)  return node.value;
		else if(leftvalue == 0) return rightvalue;
		else return leftvalue;
	}

}
