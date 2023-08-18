package BSTrees;

public class ConstructBSTree {
	public static void main(String args[]) {
		int arr[] = {10,20,30,5,45,4,6,3,7};
		TreeNode node = new TreeNode(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
				createNode(node, arr[i]);
		}
		
		
		TreeNode foundNode = searchElement(node, 23);
		System.out.println(foundNode);
	}
	
	public static TreeNode createNode(TreeNode node, int value) {
		if(node == null) {
			node = new TreeNode(value);
			return node;
		}
		if(node.value > value) {
			node.left = createNode(node.left, value);
			return node;
		} else {
			node.right =  createNode(node.right, value);
			return node;
		}
	}
	
	public static TreeNode searchElement(TreeNode node, int k) {
		if(node == null) return null;
		if(node.value == k) {
			return node;
		} else if(node.value > k) {
			return searchElement(node.left, k);
		} else if(node.value < k) {
			return  searchElement(node.right, k);
		}
		return null;
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