package company_questions;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int gcd=1;
		System.out.println("Enter the first digit");
		int n=s.nextInt();
		System.out.println("Enter the second digit");
		int m=s.nextInt();
		for(int i=1;i<=n && i<=m;++i) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
