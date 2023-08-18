package TreeSample;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void main(String args[]) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		
		Queue<Node> queue = new LinkedList();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			node = queue.poll();
			
			System.out.println(node.value);
			
			if(node.left != null) {
				queue.add(node.left);
			}
		
			if(node.right != null) {
				queue.add(node.right);
			}
		}
	}
}
