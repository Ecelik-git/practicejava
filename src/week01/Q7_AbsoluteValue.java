package week01;

import java.util.Scanner;

public class Q7_AbsoluteValue {

	public static void main(String[] args) {
	//java program by using if-else to find absolute value
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		double number = scan.nextDouble();
		
		if(number>=0) {
			System.out.println("Absolute value of "+number+" is "+number+".");
		}else {
			double num = number*-1;
			System.out.println("Absolute value of "+number+" is "+num+".");
		}
		scan.close();
	}

}
