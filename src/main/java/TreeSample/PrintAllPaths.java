package TreeSample;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPaths {
	
	public static void main(String args[]) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
				
		System.out.println(printAllPaths(node , 11));
	}
	
	static int sum = 0;
	static List<Integer> list = new ArrayList();
	public static boolean printAllPaths(Node node, int k) {
		if(k == sum) {
			System.out.println("printing list is equal to k" + list);
			return true;
		}
		if(node == null) return false;
		if(node != null) {
			list.add(node.value);
			sum = sum + node.value;
		}
		boolean left = printAllPaths(node.left, k);
		if(node.left != null) {
			list.remove(list.size()-1);
			sum = sum - node.left.value;
		}
		boolean right = printAllPaths(node.right, k);
		if(node.right != null) {
			list.remove(list.size() - 1);
			sum = sum - node.right.value;
		}
		return left || right;
	}

}
