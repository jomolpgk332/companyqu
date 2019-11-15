package company_questions;
import java.util.Scanner;
public class Greatst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		System.out.println("Enter third number");
		int n3=s.nextInt();
		if((n1>n2)&&(n1>n3)) {
			System.out.println(n1);
		}
		else if((n2>n1)&&(n2>n3)) {
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
			
	}

}
