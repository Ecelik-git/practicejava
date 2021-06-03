package week04;

import java.util.Scanner;

public class P_Q01_String_LastThreeChars {

	public static void main(String[] args) {
//		Write a Java program to take the last three characters from a given string and
//		 *  add the three characters at both the front and back of the string.
//		  String length must be greater than three and more.
//			INPUT      : Ankara
//		    OUTPUT  : araAnkaraara
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String a = scan.nextLine().trim();
		int b = a.length();
		String c = a.substring(b-3);
		String d = ""+c+a+c;
		System.out.println(d);
		scan.close();

	}

}
