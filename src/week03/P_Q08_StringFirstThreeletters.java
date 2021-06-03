package week03;

import java.util.Scanner;

public class P_Q08_StringFirstThreeletters {
	// Type the codes which asks the user to enter the name.
    //It prints the first three characters of the name and puts 
	//**for the rest of the characters.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name: ");//david
		String a = scan.nextLine().trim();
		
		String b = a.substring(0, 3) +a.substring(3).replaceAll("\\w", "*");
		System.out.println(b);//dav**
		
		scan.close();
	}

}
