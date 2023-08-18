package BSTrees;

public class ValidateBinarySearchTree {
	
	public static void main(String args[]) {
		ConstructBSTree bstree = new ConstructBSTree();
		int arr[] = {5,45,4,6,3,7,10,20,30};
		TreeNode node = new TreeNode(arr[0]);
		for(int i=1;i<arr.length;i++) {
			bstree.createNode(node, arr[i]);
		}
		System.out.println(validateBSTree(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static boolean validateBSTree(TreeNode node, int startRange, int endRange) {
		
		//int minvalue = Integer.MIN_VALUE;
		//int maxvalue = Integer.MAX_VALUE;
		
		  if(node ==  null) return true;
		
		  if(node.value < startRange || node.value > endRange) { return false; }
		 
		  return validateBSTree(node.left, startRange, node.value-1) && validateBSTree(node.right, node.value+1, endRange);
	}
}
