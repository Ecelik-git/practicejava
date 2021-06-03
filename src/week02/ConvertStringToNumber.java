package week02;

public class ConvertStringToNumber {

	public static void main(String[] args) {
		String a = "$15.99";
		String b = "$2.50";
		
		String c = a.replace("$", "").replace(".", ""); 
		String d = b.replace("$", "").replace(".", "");
		System.out.println((Integer.parseInt(c)+Integer.parseInt(d))/100.0);
		//or
		String e = a.replace("$", ""); 
		String f = b.replace("$", "");
		System.out.println(Double.parseDouble(e)+Double.parseDouble(f));

	}

}
