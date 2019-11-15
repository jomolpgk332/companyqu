package company_questions;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int orgnum,num,rem,rev=0;
		System.out.println("Enter the digit");
		num=s.nextInt();
		orgnum=num;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			
			num=num/10;
			
		}if(orgnum==rev) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
