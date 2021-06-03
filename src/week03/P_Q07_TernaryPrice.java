package week03;

import java.util.Scanner;

public class P_Q07_TernaryPrice {
	/*
    Write a code using ternary:
Create int variable : price
Create string variable : decision
If the price = $10 Print “it's cheap”
If price is 10-$20 print “it's ok” 
Otherwise “it's expensive”.
ORNEK:
INPUT      : price= 12                
OUTPUT  : it's ok
INPUT      : price= 10                
OUTPUT  : it's cheap
INPUT      : price= 23                
OUTPUT  : it's expensive
    */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the price: ");
		
		int price = scan.nextInt();
		
		String result = price<=10? "it is cheap":(price<20? "it is OK":
			"It is expensive");
		System.out.println(result);
		scan.close();
	}

}
