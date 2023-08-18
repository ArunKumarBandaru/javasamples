package TreeSample;

import java.util.ArrayList;

public class PathSumSample {
	
	public static void main(String args[]) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);
		
		treeNode.right.left = new TreeNode(6);
		treeNode.right.right = new TreeNode(8);
		
		int maxSumPath = pathSum(treeNode);
		
		System.out.println(maxSumPath);
	}
	
	static int sum = 0;
	static int k = 11;
	static int maxSumPath = Integer.MIN_VALUE;
	static ArrayList<Integer> list = new ArrayList();
	public static int pathSum(TreeNode node) {
		
		if(maxSumPath < sum) {
			maxSumPath = sum;
		}
		
		if(node == null)   {
			return 0;
		}
			
		
		sum = sum + node.value;
		pathSum(node.left);
		pathSum(node.right);
		sum = sum - node.value;
		
		return maxSumPath;
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