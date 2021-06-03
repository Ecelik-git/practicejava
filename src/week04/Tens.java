package week04;

import java.util.Scanner;

public class Tens {

	public static void main(String[] args) {
//		Print numbers from given number till the next multiple of 10. e.g.,
//		  if input is 5 it should print 5, 6, 7, 8, 9, 10 or
//		  if input is 27 it should print 27, 28, 29, 30 or
//		  if input is 40 then it should print 40.

		printUntiltens();
	}
	public static void printUntiltens() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		if(a%10==0) {
			System.out.println(a);
		}else {
			do {
				System.out.println(a);
				a++;
			}while(a%10!=0);
			System.out.println(a);
		}
		scan.close();
		
		
	}

}
