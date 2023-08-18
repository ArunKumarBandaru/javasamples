package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingIntervals {
	
	public static void main(String args[]) {
		int[][] intervals = {{2,4},{1,3},{6,8},{9,9},{10,15}};
		
		List<IntervalObject> list = new ArrayList();
		for(int i=0;i<intervals.length;i++) {
				IntervalObject intervalObject = new IntervalObject(intervals[i][0], intervals[i][1]);
				list.add(intervalObject);
		}
		Collections.sort(list, new Comparator<IntervalObject>() {
			@Override
			public int compare(IntervalObject o1, IntervalObject o2) {
				// TODO Auto-generated method stub
				System.out.println(o1.startValue);
				return o1.startValue - o2.startValue;
			}
			
		});
		
		System.out.println(list);
	}

}
