package week04;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number();
	}
	public static void number() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		int b = a/2;
		int sum =0;
		for(int i=1; i<=b; i++) {
			if(b%i==0) {
				sum +=i;
			}
		}
		if (sum == a) {
			System.out.println("Perfect number");
		}else {
			System.out.println("Not perfect");
		}
		scan.close();
	}

}
