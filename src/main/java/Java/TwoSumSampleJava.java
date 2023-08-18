package Java;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSampleJava {
	
	public static void main(String args[]) {
		int arr[] = {2,2,2,7,11,15}; 
		int target = 4;
		Map<Integer, Integer> map = new HashMap();
		for(int i=0;i<arr.length;i++) {
			int b = target - arr[i];
			if(map.containsKey(b)) {
				System.out.println(arr[i] + " " + b);
				System.out.println("printing map value in the console :: "+ map);
			} else {
				map.put(arr[i], 1);
			}
		}
	}
}
