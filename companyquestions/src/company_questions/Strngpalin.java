package company_questions;
import java.util.Scanner;
public class Strngpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=s.next();
		String b=b(a);
		System.out.println(b);
	}
	public static String b(String str) {
			if(str.isEmpty()) {
				return str;
			}
			return b(str.substring(1))+str.charAt(0);
}
}
