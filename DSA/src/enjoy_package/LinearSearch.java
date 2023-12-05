package enjoy_package;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int index;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = in.nextInt();
		boolean found = false;
		int[] arr = {1,2,3,4,5};
		for(index=0;index<arr.length;index++) {
			if(arr[index]==num) {
				found=true;
			}
		}
		if(found) {
			System.out.println(num+" is present at index "+(index-1));
		}
		else {
			System.out.println(num+" is not present");
		}
	}
}
