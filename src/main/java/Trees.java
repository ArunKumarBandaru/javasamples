
public class Trees {
	
	public static void main(String args[]) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		
		
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);
		
		treeNode.right.left = new TreeNode(6);
		treeNode.right.right = new TreeNode(7);
		
		invertTree(treeNode);
		
		System.out.println(treeNode.left.value);
		System.out.println(treeNode.right.value);
		
		System.out.println(treeNode.left.left.value);
		System.out.println(treeNode.left.right.value);
		System.out.println(treeNode.right.left.value);
		System.out.println(treeNode.right.right.value);
		
		System.out.println(treeNode.value);
	}
	
	public static void invertTree(TreeNode treeNode) {
		
		if(treeNode == null) return;
		
		invertTree(treeNode.left);
		invertTree(treeNode.right);
		
		TreeNode temp = treeNode.left;
		treeNode.left = treeNode.right;
		treeNode.right = temp;
		
	}

}

class TreeNode {
	int value ;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int value) {
		this.value = value;
	}
}