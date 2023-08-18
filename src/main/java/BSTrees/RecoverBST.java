package BSTrees;

import java.util.ArrayList;
import java.util.List;

public class RecoverBST {
	
	public static void main(String args[]) {
		
		Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);
        
        List<Integer> list = Inorder(root);
		
        recoverBST(list);
	}
	
	public static void recoverBST(List<Integer> list) {
		int count = 0;
		int startIndex = 0;
		int otherIndex = 0;
		for(int i=0;i<list.size()-1;i++) {
			if(!(list.get(i) < list.get(i+1))) {
				count++;
				if(count == 1) {
					System.out.println(list.get(i));
					startIndex = i;
				} else {
					System.out.println(list.get(i+1));
					otherIndex = i+1;
				}
			} 
		}
		
		int temp = list.get(otherIndex);
		list.set(otherIndex, list.get(startIndex));
		list.set(startIndex, temp);
		
		
		TreeNode node = new TreeNode(list.get(0));
		
		for(int i=1;i<list.size();i++) {
				ConstructBSTree.createNode(node, list.get(i));
		}
		
	}
	
	static List<Integer> list = new ArrayList<Integer>();
	public static List<Integer> Inorder(Node root) {
		
		if(root == null) return list;
		
		Inorder(root.left);
		list.add(root.data);
		Inorder(root.right);
		
		return list;
	}

}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}