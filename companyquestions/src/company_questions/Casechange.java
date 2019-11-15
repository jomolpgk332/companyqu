package company_questions;
import java.util.Scanner;
public class Casechange {

	public static void main(String[] args) {
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		temp=(int)ch;
		temp=(temp)-32;
		ch=(char)temp;
		System.out.println(ch);
	}

}
