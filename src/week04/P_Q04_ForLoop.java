package week04;

import java.util.Scanner;

public class P_Q04_ForLoop {
//	Ask user to enter a name and a character,
//	then check how many times the character is repeated
//	in the name using loops in the name
//	 Example:
//	        INPUT      :char ch1= 'a' ;
//	                    String name =“John came late"
//	        OUTPUT :  2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name and a char: ");
		String a = scan.nextLine();
		char b = scan.next().charAt(0);
		int count = 0;
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i)==b) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
