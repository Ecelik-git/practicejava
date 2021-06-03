package week02;

import java.util.Scanner;

public class P_Q02_ElseIf_BMI {
	/*
    Ask user to their weight and height and type a program with calculates mass index
    HINT : Body Mass Index = Weight (kg) / Square of height (m)
    Then give a message to user as following:
    If BMI is less than 18.5 , print "you re weak"
    If BMI is between 18.5 and 25 ,print  "your weight is ideal"
    If BMI is between 25 and 30, print "you re fat"
    If BMI is more than or equal to 30, print "obese" 
    
    EXAMPLE : 
    
    INPUT: Weight : 71
           Height : 1,72
           
    OUTPUT : Your BMI is  : 23.99945916711736
    */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter weight and height: ");
		double w = scan.nextDouble();
		double h = scan.nextDouble();
		double bmi = w/(h*h);
		System.out.println(bmi);
		if(w<0 && h<0) {
			System.out.println("Please enter your weight and height");
		}else if(bmi<18.5) {
			System.out.println("you are weak");
		}else if(bmi<25) {
			System.out.println("Your weight is ideal");
		}else if(bmi<30) {
			System.out.println("Your are fat");
		}else {
			System.out.println("Your are obese");
		}
		scan.close();
	}
}
