package Java.Sorting;

public class MergeSort {
	public static void main(String args[]) {
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,6};
		int i=0;
		int j=0;
		int temparr = arr1.length + arr2.length;
		int[] tempNewArr = new int[temparr]; 
		int k=0;
		while(i<arr1.length &&  j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				tempNewArr[k] = arr1[i];
				i++;
				k++;
			} else  {
				tempNewArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i< arr1.length) {
			tempNewArr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j< arr2.length) {
			tempNewArr[k] = arr2[j];
			j++;
			k++;
		}
		
		for(int l=0;l<tempNewArr.length;l++) {
			System.out.print(tempNewArr[l] + " ");
		}
	}
}
