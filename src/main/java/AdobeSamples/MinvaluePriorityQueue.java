package AdobeSamples;

import java.util.ArrayList;
import java.util.List;

public class MinvaluePriorityQueue {
	public static void main(String args[]) {
		int arr[] = new int[] {100, 50, 60, 110};
		//kth smallest value in the integer array values
		
		int k = 4;
		for(int i=0;i<k;i++) {
			int minValue = Integer.MAX_VALUE;
			int minValueIndex = 0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j] < minValue) {
					minValue = arr[j];
					minValueIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
