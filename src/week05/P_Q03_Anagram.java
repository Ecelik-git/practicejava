package week05;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q03_Anagram {

	public static void main(String[] args) {
		Anagram();

	}
	public static void Anagram() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter words");
		String a = scan.next().toLowerCase();
		String ab[]= a.split("");
		System.out.println("Please enter words");
		String b = scan.next().toLowerCase();
		String bc[]= b.split("");
		Arrays.sort(ab);
		Arrays.sort(bc);
		int count = 0;
		for (int i = 0; i<a.length(); i++) {
			if(ab[i].equals(bc[i])) {
				count ++;
			}
		}
		System.out.println(count);
		if (count == a.length()) {
			System.out.println("Anagram");
		}else {
			System.out.println("not anagram");
		}
		scan.close();
	}

}
