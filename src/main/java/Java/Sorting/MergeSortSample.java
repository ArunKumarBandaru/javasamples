package Java.Sorting;

public class MergeSortSample {
	static int[] arr1 = {1,3,5,2,4,6};
	static int i = 0;
	static int j = arr1.length;
	public static void main(String args[]) {
		mergeSort(arr1, i, j);
		for(int value: arr1) {
			System.out.println(value);
		}
	}
	
	public static void mergeSort(int arr1[], int i, int j) {
		if(i == j) return;
		
		int mid = (i + j)/2;
		mergeSort(arr1, i, mid);
		mergeSort(arr1, mid+1, j);
		mergeAll(arr1, i, mid, j);
	}
	
	
	public static void mergeAll(int arr1[], int i, int mid, int j) {
		int temp[] = new int[j-i+1];
		int k = 0;
		
		int p1 = i;
		int p2 = mid+1;
		
		while(p1 <= mid && p2 <= j) {
			if(arr1[p1] < arr1[p2]) {
				temp[k] = arr1[p1];
				k++;
				p1++;
			} else {
				temp[k] = arr1[p2];
				k++;
				p2++;
			}
		}
		
		while(p1 < mid) {
			temp[k] = arr1[p1];
			k++;
			p1++;
		}
		
		while(p2 < j) {
			temp[k] = arr1[p2];
			k++;
			p2++;
		}
		
		int f = 0;
		for(int l=i;l<j;l++) {
			arr1[l] = temp[f];
			f++;
		}
	}
}
