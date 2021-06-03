package week01;

import java.util.Scanner;

public class Q5_MinuteToYears {
	//3456789 mins to years and days

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//60 mins 1 h
		//24 h 1 day
		//365 days 1 year
		System.out.println("Enter minutes: ");
		double minute = scan.nextDouble();
		int year = (int)(minute/(60*24*365));
		int day = (int)(minute/60*24)%365;
		System.out.println(minute + " minutes is "+year+" years and "+day+" days");
		scan.close();
	}

}
