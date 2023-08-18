package TreeSample;

public class SumOfAllNodes {
	public static void main(String args[]) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		
		
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);
		
		treeNode.right.left = new TreeNode(6);
		treeNode.right.right = new TreeNode(7);
		
	   int value =	sumOfAllNodes(treeNode);
	   System.out.println(value);
	}
	
	static int sum = 0;
	public static int sumOfAllNodes(TreeNode node) {
		
		if(node == null) return 0;
		
		sum = sum + node.value;
		sumOfAllNodes(node.left);
		sumOfAllNodes(node.right);
		
		return sum;
	}
}
