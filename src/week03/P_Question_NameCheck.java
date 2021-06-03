package week03;

import java.util.Scanner;

public class P_Question_NameCheck {
	/*
    Ask user to enter his kid’s name, if the name contains “a” 
    output will be “This name contains ‘a’.”
if the name contains “z” output will be “This name contains ‘z’.” 
Otherwise, output will be
“This name contains neither ‘a’ nor ‘z’.”
    */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your kid's name: ");
		String name = scan.next().toLowerCase();
		if(name.contains("a")) {
			System.out.println(name + " contains the letter a");
		}else if (name.contains("z")) {
			System.out.println(name + " contains the letter z");
		}else {
			System.out.println(name + " doesn't contain neither a nor z");
		}
		scan.close();
	}

}
