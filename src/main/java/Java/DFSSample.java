package Java;

import java.util.ArrayList;
import java.util.List;

public class DFSSample {
	public static void main(String args[]) {
		int source = 1;
		int destination = 6;
		
		boolean[] boolvalues = new boolean[destination+1];
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
		ArrayList<ArrayList<Integer>> listofints = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<list.size();i++) {
			listofints.add(new ArrayList<Integer>());
		}
		for(int i=0;i<list.size();i++) {
			listofints.get(list.get(i)).add(list1.get(i));
			listofints.get(list1.get(i)).add(list.get(i));
		}
		applyDFS(listofints,boolvalues,source);
		System.out.println(boolvalues[destination]);
	}
	
	public static void applyDFS(ArrayList<ArrayList<Integer>> listoflists, boolean[] boolvalues, int source) {
		if(boolvalues[source] == true) return;
		boolvalues[source] = true;
		
		ArrayList<Integer> list = listoflists.get(source);
		for(int i=0;i<list.size();i++) {
			applyDFS(listoflists, boolvalues, list.get(i));
		}
	}
}
