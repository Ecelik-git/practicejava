package week03;

import java.util.Scanner;

public class P_Question01_Gender {
	/*
    Type a program that ask user their age and gender. 
    If age is greater or equal than 18 and if gender is male, 
    then print man ,
    If age is greater or equal than 18 and if gender is female 
    then print woman
    If age is less than 18 and if gender is male 
    then print boy ,
    If age is less than 18 and if gender is female 
    then print girl on the console.
    */


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age and gander: ");
		int age = scan.nextInt();
		String gender = scan.next();
		
		if (age>=18) {
			if(gender.equalsIgnoreCase("male")) {
				System.out.println("MAN");
			}else if(gender.equalsIgnoreCase("female")) {
				System.out.println("WOMAN");
			}else {
				System.out.println("Please enter valid gender");
			}
		}else if(age>=0 && age<18) {
			if(gender.equalsIgnoreCase("male")) {
				System.out.println("BOY");
			}else if(gender.equalsIgnoreCase("female")) {
				System.out.println("GIRL");
			}else {
				System.out.println("Please enter valid gender");
			}
		}else {
			System.out.println("Please enter valid age");
		}
		scan.close();
	}

}
