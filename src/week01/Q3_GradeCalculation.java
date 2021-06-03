package week01;

import java.util.Scanner;

public class Q3_GradeCalculation {
	/*
    Ask user to enter mid-term grade, final grade, and project grade 
    Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
     Example: 
         INPUT: mid-term grade=78
                final grade = 66
                project grade = 90 
         OUTPUT: "Your grade is : 81,6"
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter mid-term:");
		double midTerm = scan.nextDouble();
		System.out.println("Please enter project: ");
		double project = scan.nextDouble();
		System.out.println("Please enter final greade: ");
		double last = scan.nextDouble();
		double finalGrade = midTerm*3/10+project*2/10+last/2;
		System.out.println("Your grade is "+finalGrade);
		scan.close();

	}

}
