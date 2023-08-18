package TreeSample;

public class InorderTraversal {
	
	public static void main(String args[]) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		
		
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);
		
		treeNode.right.left = new TreeNode(6);
		treeNode.right.right = new TreeNode(7);
		
		inorderTraversal(treeNode);
		
	}
	
	public static void inorderTraversal(TreeNode treeNode) {
		
		if(treeNode == null) return;
		
		inorderTraversal(treeNode.left);
		System.out.print(treeNode.value + " ");
		inorderTraversal(treeNode.right);
	}
}
