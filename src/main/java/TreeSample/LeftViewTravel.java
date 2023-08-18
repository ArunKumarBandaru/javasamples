package TreeSample;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTravel {
	public static void main(String args[]) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		
		Queue<Node> queue = new LinkedList();
		queue.add(node);
		System.out.println(node.value);
		queue.add(null);
		boolean available = false;
		while(queue.size() > 1) {
			node = queue.poll();
			//System.out.println(node);
			
			if(node == null) {
				queue.add(null);
				available = true;
				continue;
			}
			
			if(available == true) {
				System.out.println(node.value);
				available = false;
			}
			
			if(node.right != null) {
				queue.add(node.right);
				
			}
		
			if(node.left != null) {
				queue.add(node.left);
			}
		}
	}
}
