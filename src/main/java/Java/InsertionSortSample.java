package Java;

public class InsertionSortSample {
	public static void main(String args[]) {
		int arr[] = {5, 6, 7, 4};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
			for(int j=1;j<arr.length;j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(count);
	}
}
