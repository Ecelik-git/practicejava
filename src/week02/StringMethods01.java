package week02;

public class StringMethods01 {

	public static void main(String[] args) {
		String a = " David123 steel@#! "; //to David STEEL
		String b = a.replaceAll("\\W", "").replace("steel", "STEEL").replace("123", " ");
		System.out.println(b);
		
		//with substring
		String c = a.substring(1, 6) + " "+ a.substring(10, 15).toUpperCase();
		System.out.println(c);
 	}

}
