package BFSorDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSSample {
	//[[], [2, 4], [1, 4, 3], [2, 5], [1, 2, 5], [3, 6, 4], [5]]
	public static void main(String args[]) {
		
		int source = 1;
		int destination = 6;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(4);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		list1.add(5);
		list1.add(7);
		
		boolean[]  bool = new boolean[destination + 1];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		ArrayList<ArrayList<Integer>> listofints = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<list.size();i++) {
			listofints.add(new ArrayList<Integer>());
		}
		for(int i=0;i<list.size();i++) {
			listofints.get(list.get(i)).add(list1.get(i));
			listofints.get(list1.get(i)).add(list.get(i));
		}
		
		//System.out.println("Printing list of ints:: "+ listofints);
		queue.add(source);
		List<Integer> innerList = null;
		while(!queue.isEmpty()) {
			int value = queue.poll();
			innerList = listofints.get(value);
			for(int i=0;i<innerList.size();i++) {
				int innerListvalue = innerList.get(i);
				if(bool[innerListvalue] == false) {
					bool[innerListvalue] = true;
					queue.add(innerListvalue);
				}
			}
		}
		System.out.println(bool[destination]);
	}
}
