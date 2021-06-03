package week04;

import java.util.Scanner;

public class P_Q02_String_FullName {

	public static void main(String[] args) {
//		Ask user to enter their fullname as two words.
//		 Convert their full name as following :
//		 INPUT : JULIA ROBERTS  -->  OUTPUT :Julia ROBERTS
//		 (Initial of the firstname should be uppercase and the rest of firstname should be
//		 lowercase. All letters of lastname should be in uppercase)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scan.nextLine().trim().toUpperCase();
		int a = name.indexOf(" ");
		char f = name.charAt(0);
		String First = name.substring(1, a).toLowerCase();
	
		String Last = name.substring(a, name.length());
		System.out.println(""+f+First+ " "+ Last);
		scan.close();

	}

}
