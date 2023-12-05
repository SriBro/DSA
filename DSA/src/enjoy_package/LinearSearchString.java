package enjoy_package;
import java.util.Scanner;

public class LinearSearchString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking String as a user input
		System.out.println("Enter any name: ");
		String name = sc.next();
		//Taking character as a user input
		System.out.println("Enter any character: ");
		char target = sc.next().charAt(0);
		if(search(name,target)){
			System.out.println(target+" is present inside "+name);
		}
		else{
			System.out.println(target+" is not present inside "+name);
		}
	}
	static boolean search(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		//for loop running through entire array
		for(int i=0;i<str.length();i++){
			//if target matches array element return true
			if(target == str.charAt(i)){
				return true;
			}
		}
		return false;
	}
}
