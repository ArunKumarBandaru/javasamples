package Java;

import java.util.ArrayList;
import java.util.List;

public class NumSubSets {
	public static void main(String args[]) {
		
		ArrayList<Integer> listofints = new ArrayList<Integer>();
		listofints.add(5);
		listofints.add(2);
		//listofints.add(7);
		
		ArrayList<ArrayList<Integer>> listoflists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		backTrackingSubSets(listoflists, list, listofints, 0);
		System.out.println(listoflists);
	}
	
	public static void backTrackingSubSets(ArrayList<ArrayList<Integer>> listoflists, 
			ArrayList<Integer> list, ArrayList<Integer> listofints, int start) {
		
		listoflists.add(new ArrayList(list));
		for(int j=start;j<listofints.size();j++) {
			
			list.add(listofints.get(j));
			
			backTrackingSubSets(listoflists,list, listofints, j+1);
			
			list.remove(list.size()-1);
			
		}
		
	}
}
