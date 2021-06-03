package week05;

import java.util.Scanner;

public class P_Q02_Arrays_Print {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 names: ");
		String str = scan.nextLine();
//		String arr[]= new String[5];
//		for (int i = 0; i<5; i++) {
//			arr[i]= scan.next();
//			
//		}
		String arr[]= str.split(" ");
		for (int k =0; k<arr.length; k++) {
			
			System.out.print(arr[k]+" ");
			System.out.print(arr[k].length()+" ");
	
		}
		
		scan.close();
	}

}
