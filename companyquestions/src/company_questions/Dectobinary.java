package company_questions;

import java.util.Scanner;

public class Dectobinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,a;
		String x="";
		System.out.println("Enter any value");
		n=s.nextInt();
		while(n>0) {
			a=n%2;
			 x=a+x;
			n=n/2;
		}
		System.out.println(x);
	}

}
