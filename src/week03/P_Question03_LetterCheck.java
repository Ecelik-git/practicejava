package week03;

import java.util.Scanner;

public class P_Question03_LetterCheck {
	/*
    Ask user to enter a letter.
    If user enters a letter that in first four letters, 
    Your program will print "(This letter) is in the first four letters" 
    It will also print if this letter is vowel or consonant
    Use switch.
    
    Example :
    INPUT: A
    OUTPUT: "A is in first letters"
            "A is vowel"
     
    */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		char l = scan.next().toUpperCase().charAt(0);
		if(l>='A' && l<='D') {
			switch(l) {
			case 'A':
				System.out.println(l+" is in the first 4 letters and it is a vowel");
				break;
			case 'B':
				System.out.println(l+" is in the first 4 letters and it is a consonant");
				break;
			case 'C':
				System.out.println(l+" is in the first 4 letters and it is a consonant");
				break;
			case 'D':
				System.out.println(l+" is in the first 4 letters and it is a consonant");
				break;
				
			}
		}else if(l>='E' && l<='Z') {
			switch(l) {
			case 'E':
				System.out.println(l+" is not in the first 4 letters and it is a vowel");
				break;
			case 'I':
				System.out.println(l+" is not in the first 4 letters and it is a vowel");
				break;
			case 'O':
				System.out.println(l+" is not in the first 4 letters and it is a vowel");
				break;
			case 'U':
				System.out.println(l+" is not in the first 4 letters and it is a vowel");
				break;
			default:
				System.out.println(l+" is not in the first 4 letters and it is a consonant");	
				
			}
		}else {
			System.out.println("Please enter a valid letter");
		}
		scan.close();
		

	}

}
