package Java;

import java.util.HashMap;
import java.util.Map;

public class ThreeSumSample {
	public static void main(String args[]) {
		int[] nums = new int[] {1,2,3,4};
		int target = 9;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			int b = target - nums[i];
			int newint[] = findTwoValues(nums, map, b);
			if(newint.length == 2) {
				System.out.println(nums[i] + " "+ newint[0] +  " " + newint[1]);
			}
		}
	}
	
	public static int[] findTwoValues(int[] nums, Map<Integer, Integer> map, int newTarget) {
		for(int i=0;i<nums.length;i++) {
			int b = newTarget - nums[i];
			if(map.containsKey(b)) {
				if(map.get(b) > 1)
					return new int[] {b, nums[i]};
			} else {
				if(map.containsKey(nums[i])) {
					int value = map.get(nums[i]);
					++value;
					map.put(nums[i], value);
				} else {
					map.put(nums[i], 1);
				}
			}
		}
		return new int[] {0};
	}
}


