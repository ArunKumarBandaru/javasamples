package Java.Sorting;


// you can use list to track of values..
public class SubsetsDisplay {
	static int i = 0;
	static int numberofpw = 3;

	public static void main(String args[]) {
		int arr[] = {5,2,7};
		displaySubsets(arr, 0);
	}
	
	static int sum = 0;
	static int target = 7;
	public static void displaySubsets(int[] arr, int i) {

		if (sum == target) {
			System.out.println("sum :: "+ sum);
			return;
		}
		
		if(i == arr.length) {
			return;
		}

		sum  = sum + arr[i];
		displaySubsets(arr, i+1);
		
		System.out.println();
		//--i;
		sum = sum - arr[i];
		displaySubsets(arr, i+1);

		
	}
}
