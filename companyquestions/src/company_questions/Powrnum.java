package company_questions;
import java.util.Scanner;
public class Powrnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int temp;
		System.out.println("Enter the base value");
		int n=s.nextInt();
		temp=n;
		System.out.println("Enter the power value");
		int pow=s.nextInt();
		for(int i=0;i<pow;i++) {
			temp=temp*pow;
		}
		System.out.println("Result of "+n+ " power is " +temp);

	}

}
