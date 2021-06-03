package week05;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q04_IndexOfArray {

	public static void main(String[] args) {
		//Create a method to find an element's index 
		//in an array
		// Get the element from the user and return index 
		//of that element
	    //int my_array[] = {12,15,43,23,56,76,78,90,77,43};
		//input : 15 ==> output : 15 is in the 1. index
		//input : 37 ==> output : -1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = scan.nextInt();
		int arr[]= {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
		Arrays.sort(arr);
		int b = Arrays.binarySearch(arr, a);
		if(b>=0) {
			System.out.println(a+" is at the index of "+b);
		}else {
			System.out.println("The list that we have doesn't include "+a);
		}
		scan.close();
	}

}
