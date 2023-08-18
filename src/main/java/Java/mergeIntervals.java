package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class mergeIntervals {
	public static void main(String args[]) {
		int[][] intervals = {{1,3},{2,4},{6,8},{9,9},{10,15}};
		
		List<IntervalObject> list = new ArrayList();
		for(int i=0;i<intervals.length;i++) {
				IntervalObject intervalObject = new IntervalObject(intervals[i][0], intervals[i][1]);
				list.add(intervalObject);
		}
		
		
		Collections.sort(list, new Comparator<IntervalObject>() {
			@Override
			public int compare(IntervalObject o1, IntervalObject o2) {
				// TODO Auto-generated method stub
				//System.out.println(o1.startValue);
				return o1.startValue - o2.startValue;
			}
		});
		
		Stack<IntervalObject> stack = new Stack();
		stack.add(list.get(0));
		
		for(int i=1;i<list.size();i++) {
			IntervalObject topObject = list.get(0);
			if(topObject.endValue < list.get(i).startValue) {
				stack.push(list.get(i));
			} else if(topObject.endValue < list.get(i).endValue ) {
				topObject.endValue = list.get(i).endValue;
				stack.pop();
				stack.push(topObject);
			}
		}
		
		System.out.println("Printing something in the console:: " + stack);
		
	}
	
	
}

class IntervalObject {
	int startValue;
	int endValue;
	
	public IntervalObject(int startValue, int endValue) {
		this.startValue = startValue;
		this.endValue = endValue;
	}
	
	public String toString() {
		return Integer.toString(startValue) + " " + Integer.toString(endValue);
	}
	
}
