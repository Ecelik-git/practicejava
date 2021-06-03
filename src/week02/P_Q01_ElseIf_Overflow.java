package week02;

import java.util.Scanner;

public class P_Q01_ElseIf_Overflow {
	/*
    Write a Java program to compute and print sum of two 
    given numbers (more than or equal to zero). 
If the sum have more than 10 digits, print "overflow".
EXAMPLE:
INPUT      :  
Input two integers:
25
46
OUTPUT :  
Sum of the said two numbers:
71       
*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		if(a<0 || b<0) {
			System.out.println("Please enter positive numbers");
		}else if ((a+b)>=1000000001d) {
			System.out.println("overflow");
		}else {
			System.out.println("Sum of the said two numbers: " + (a+b));
		}
		scan.close();
	}

}
