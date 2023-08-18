package Java;

import java.util.ArrayList;
import java.util.List;

public class NumberofunconnectedComponents {
	
	public static void main(String args[]) {
		int numberofnodes = 5;
		boolean[] bolvalues = new boolean[numberofnodes];
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(2);
		list.add(3);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(1);
		list1.add(4);
		
		boolean[] boolvalues = new boolean[5];
		
		ArrayList<ArrayList<Integer>> listoflists = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<numberofnodes;i++) {
			listoflists.add(new ArrayList<Integer>());
		}
		
		System.out.println("Printing an element :: "+listoflists.size());
		
		for(int i=0;i<list.size();i++) {
			listoflists.get(list.get(i)).add(list1.get(i));
			listoflists.get(list1.get(i)).add(list.get(i));
		}
		
		System.out.println(listoflists);
		int count = 0;
		for(int i=0;i<numberofnodes;i++) {
			if(bolvalues[i] ==  false) {
				count++;
				dfs(listoflists, bolvalues, i);
			}
		}
		System.out.println("count displaying in the values :: " +count);
	}
	
	public static void dfs(ArrayList<ArrayList<Integer>> listoflist, boolean[] boolvalues,	int source) {
		if(boolvalues[source] == true) return;
		boolvalues[source] = true;
		
		for(int i=0;i<listoflist.get(source).size();i++) {
			dfs(listoflist, boolvalues, listoflist.get(source).get(i));
		}
		
	}

}
