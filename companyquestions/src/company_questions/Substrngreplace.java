package company_questions;
import java.util.Scanner;
public class Substrngreplace {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the original string");
		String orstr=s.next();
		orstr=orstr.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
		System.out.println("*"+orstr);
		
		
	}
}
