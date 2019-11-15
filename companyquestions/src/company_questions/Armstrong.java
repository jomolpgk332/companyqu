package company_questions;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,sum=0,temp;
		System.out.println("Enter the number");
		int n=s.nextInt();
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
			
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}

}
