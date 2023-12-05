package enjoy_package;
import java.util.Arrays;

public class InsertionSort {
	
	static void insertionSort(int[] arr) {
		//outer loop running for a total of (n-2) times because of no of comparisons
		for(int i=0; i<arr.length-1; i++) {
			//inner loop will always be greater than 1 so as to compare with previous element
			//it will run until it becomes greater than zero
			for(int j=i+1;j>0;j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
	}
	//swapping greater and smaller number
	static void swap(int[] arr, int first, int second){
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {1,4,3,2};
		//calling function
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
