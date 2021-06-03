package week01;

import java.util.Scanner;

public class Q6_MaxMinNumber {

	public static void main(String[] args) {
		//ask users enter 3 numbers and 
		//print max and min
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		System.out.println("Enter another number: ");
		int b = scan.nextInt();
		System.out.println("Enter another number: ");
		int c = scan.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Maximum number is "+a);
			
		}else if(b>c){
			System.out.println("Maximum number is "+b);
		}else {
			System.out.println("Maximum number is "+c);
		}
		
		if(a<b && a<c) {
			System.out.println("Minimum number is "+a);
			
		}else if(b<c){
			System.out.println("Minimum number is "+b);
		}else {
			System.out.println("Minimum number is "+c);
		}
		scan.close();

	}

}
