package week03;

import java.util.Scanner;

public class P_Question_NewAccount {
	/*
     * Type the program which asks the user to enter 10 
     * character code to be able to create a new account. 
     * This code should start with a capital letter. If the codes is valid, 
     * it prints
         "You can create a new account" 
        Otherwise, it prints "Please enter a valid code"
     */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 characters: ");
		String name = scan.next();
		String result = name.length() ==10 && (name.charAt(0)>='A' && name.charAt(0)<='Z')?
				"You can create a new account":"Please enter a valid code";
		System.out.println(result);
		String str = "Java";
		System.out.println(str.replace("a", ""));
		scan.close();
	}

}
