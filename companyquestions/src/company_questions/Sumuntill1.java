package company_questions;

import java.util.Scanner;

public class Sumuntill1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n==0) {
			
		System.out.println("sum "+n);}
		else if(n%9==0) {
			System.out.println("sum is "+9);
		}
		else
		{
			System.out.println("sum is"+n%9);
		}
	}
} 