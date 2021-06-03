package week01;

public class Q1_Increment {

	public static void main(String[] args) {
		int x = 4;
		x++;
		x += x;
		--x;
		x = 7 +x;
		x *= x;
		x -=3;
		System.out.println("x = "+ x);
		
		int a = 3;
		double d = 4.5;
		
		d+=a;//4.5+3=7.5
		a+=d;//3+7.5=10.5, but a is int so it is 10
		d-=a;
		a-=d;
		System.out.println("d = "+ ++d);
		System.out.println("a = "+ a--);

	}

}
