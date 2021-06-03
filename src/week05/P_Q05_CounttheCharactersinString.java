package week05;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q05_CounttheCharactersinString {

	public static void main(String[] args) {
		//Count the number of characters in a String
		//Test the code by using abaab, abaabc, abc
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String str = scan.nextLine().trim().toLowerCase();
		String arr[] = str.split("");
		Arrays.sort(arr);
		int count = arr.length;
		for (int i = 0; i<arr.length-1; i++) {
			if(arr[i].equals(arr[i+1])) {
				count--;
			}else {
				continue;
			}
		}
		System.out.println(count);
		
		scan.close();

	}

}
