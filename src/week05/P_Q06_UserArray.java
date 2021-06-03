package week05;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q06_UserArray {

	public static void main(String[] args) {
		/* Create an array by the help of user
		 * Ask user the element to remove the element user asked
		 * Print the array on the console after removing
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements you need to add to the list: ");
		int size = scan.nextInt();
		String arr[]= new String[size];
		System.out.println("Please enter the words to add to the list: ");
		for(int i =0; i<size; i++) {
			arr[i]=scan.next().toLowerCase();
		}
		System.out.println("Which one do you want to remove?: ");
		String a = scan.next().toLowerCase().trim();
		for(int j=0; j<arr.length; j++) {
			if(arr[j].equals(a)) {
				arr[j]="";
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

}
