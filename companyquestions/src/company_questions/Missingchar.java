package company_questions;
import java.util.Scanner;
public class Missingchar {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.next();
	//int d[]=new int[a];
	String str=a.replaceAll(" ","");
	String [] ip = a.split("");
	 String alphabets[]= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
	 System.out.println(a);
	 
	}
}
