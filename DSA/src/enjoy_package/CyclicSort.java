package enjoy_package;
import java.util.Arrays;
import java.util.Scanner;
public class CyclicSort {
	
	static void cyclicSort(int[] arr){
		int i=0;
		while(i<arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
	}
	static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you need to sort: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter number "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		cyclicSort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
}
