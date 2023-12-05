/*
Define a method called selectionSort and which takes arr as a parameter.
mark the last and maximum index.
Find the maximum index by defining another getMaxIndex method. 
Swap the maxIndex and last index by defining another swap method.
 */

package enjoy_package;
import java.util.Arrays;

public class SelectionSort {
	static void selection(int[] arr) {
		for(int i=0; i< arr.length;i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr,maxIndex,last);
		}
	}
	
	static void swap(int arr[] , int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	static int getMaxIndex(int arr[] ,int start,int end) {
		int max = start;
		for(int i=start; i<=end; i++) {
			if(arr[max]<arr[i]){
				max = i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,1,2,6};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
}
