package Java;

public class BubbleSortSample {
	public static void main(String args[]) {
		int arr[] = {6, 3, 0, 5};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(count);
	}
}
