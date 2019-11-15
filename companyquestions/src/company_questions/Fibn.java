package company_questions;
import java.util.Scanner;
public class Fibn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number as limit");
		int n=s.nextInt();
		int a=0;
		int b=1;
		while(a<n) {
			System.out.println(a+ " ");
			int sum=a+b;
			a=b;b=sum;
		}
	}

}
