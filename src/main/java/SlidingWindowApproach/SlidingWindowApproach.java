package SlidingWindowApproach;

public class SlidingWindowApproach {
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		//consider window is 3
		int maxElement = Integer.MIN_VALUE;
		int windowSize = 4;
		int start = 0;
		int end = windowSize;
		
		int sumValue = 0;
		for(int i=start;i<end;i++) {
			sumValue = sumValue + arr[i];
		}
		maxElement = sumValue;
		while(start < arr.length - windowSize) {
			start  = start +1;
			end = end + 1;
			for(int i = start;i<end;i++) {
				sumValue = sumValue + arr[i];
				if(sumValue > maxElement) {
					maxElement = sumValue; 
				}
			} 
			sumValue = 0;
		}
		System.out.println("Printing maxElement in the console :: "+ maxElement);
	}
}
