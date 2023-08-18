package BSTrees;

public class ConstructAndDeleteBSTree {
	
	public static void main(String[] args) {
		
		ConstructBSTree bstree = new ConstructBSTree();
		
		int arr[] = {10,20,30,5,45,4,6,3,7};
		TreeNode node = new TreeNode(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			bstree.createNode(node, arr[i]);
		}
		//deleting single node if there is no childs for it
		int k = 5;
		node = deleteNode(node, k);
		
		System.out.println(node.left.value);
		
	}
	
	public static TreeNode deleteNode(TreeNode node, int k) {
		
		if(node.value == k){
			if(node.left == null && node.right == null) {
				return null;
			} else if(node.left != null && node.right == null) {
				return node.left;
			} else if(node.right != null && node.left == null) {
				return node.right;
			} else {
				//get the right and left most element
				TreeNode anotherNode = null;
				anotherNode = node.right;
				while(anotherNode.left !=  null) {
					anotherNode = anotherNode.left;
				}
				node.value = anotherNode.value;
				return node;
			}
		}
		
		if(node.value > k) {
			node.left = deleteNode(node.left, k);
		} else {
			node.right = deleteNode(node.right, k);
		}
		
		
		return node; 
		
	}

}
