package Java;

public class RotatedSortedArraySearch {
	
	public static void main(String args[]) {
		int arr[] = {4,5,6,7,0,1,2,3};
		int key = 2;
		
		int start = 0;
		int end = arr.length-1;
		int pivotEle = searchElement(arr, start, end);
		//System.out.println(pivotEle+1);
		int newStart = pivotEle+1;
		
		System.out.println(newSearchELementFromPivot(arr, newStart, end, key));
	}
	
	public static int newSearchELementFromPivot(int arr[], int newStart, int end, int key) {
		int mid = (newStart + end)/2 ;
		if(arr[mid] == key) {
			return mid;
		} else if(arr[mid] > key) {
			return newSearchELementFromPivot(arr,newStart,mid,key);
		} else {
			return newSearchELementFromPivot(arr,mid+1,end,key);
		}
 	}
	
	
	public static int searchElement(int arr[], int start, int end) {
		int mid = (start + end) / 2;
		if(start <= end) {
			return start;
		} else if(arr[start] > arr[mid]) {
			return searchElement(arr, start, mid);
		} else {
			return searchElement(arr, mid+1, end);
		}
	}
}
