package week01;

import java.util.Scanner;

public class Q9_Bonus {

	public static void main(String[] args) {
		/*
		 * 5% bonus for more than 5 years of service
		 * ask user to enter the salary and their 
		 * years of service
		 * print the bonus amount
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your current salary?");
		double salary = scan.nextDouble();
		System.out.println("How long have you been working?");
		int year = scan.nextInt();
		
		if (year>=5) {
			double bonus = salary/20;
			System.out.println("Your bonus is: $"+bonus);
		}else {
			int d = 5 - year;
			System.out.println("You need to work "+d+" year/s to earn bonus");
		}
		scan.close();

	}

}
