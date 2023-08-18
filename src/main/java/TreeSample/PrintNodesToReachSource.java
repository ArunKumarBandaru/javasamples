package TreeSample;

import java.util.ArrayList;
import java.util.List;

public class PrintNodesToReachSource {
	
	public static void main(String args[]) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
		
		
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(5);
		
		treeNode.right.left = new TreeNode(6);
		treeNode.right.right = new TreeNode(7);
		
		int source = 2;
		int destination = 7;
		List<Integer> list = new ArrayList();
		list.add(source);
		list.add(destination);
		
		ArrayList<ArrayList<Integer>> listofints = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sourceList = new ArrayList<Integer>();
		listofints = StoreNodes(sourceList, listofints, treeNode);
		
		System.out.println(listofints);
	}
	
	
	static boolean foundElement = true;
	public static ArrayList<ArrayList<Integer>> StoreNodes(ArrayList<Integer> sourceList, ArrayList<ArrayList<Integer>> listofints, TreeNode treeNode) {
		if(treeNode == null) {
			return listofints;
		}
		
		sourceList.add(treeNode.value);
		StoreNodes(sourceList, listofints, treeNode.left);
		StoreNodes(sourceList, listofints, treeNode.right);
		listofints.add(new ArrayList(sourceList));
		sourceList.remove(sourceList.size()-1);	
		
		
		return listofints;
	}
}
