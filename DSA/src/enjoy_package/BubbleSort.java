package enjoy_package;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	//Will do the sorting
	static void bubbleSort(int[] arr) {
		boolean swap = false;
		//Outer loop running n times
		for(int i=0; i < arr.length; i++) {
			//inner loop running (n-i-1) times
			for(int j = 1; j <= arr.length-i-1; j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swap = true;
				}
			}
			//No next element is less than the previous
			if(swap==false){
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr;
		int length;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter how many elements you need to add into Array: ");
		length = in.nextInt();
		arr = new int[length];
		for(int i=1; i<=length; i++) {
			System.out.println("Enter element "+i+": ");
			arr[i-1] = in.nextInt(); 
		}
		bubbleSort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}

}
