package Java;

import java.util.ArrayList;
import java.util.List;

public class BitManipulation {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4};
		ArrayList<ArrayList<Integer>> listoflists = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<Math.pow(2, arr.length);i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<32;j++) {
				if(((i>>j) & 1)  == 1) {
					list.add(arr[j]);
				}			
			}
			listoflists.add(list);
		}
		
		System.out.println(listoflists);
	}
}
