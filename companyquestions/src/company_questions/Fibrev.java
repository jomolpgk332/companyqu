package company_questions;

import java.util.Scanner;

public class Fibrev {
	static void rev(int n) {
		int a[]=new int[n];
		int i;
		a[0]=0;
		a[1]=1;
		for( i=2;i<n;i++) {
			a[i]=a[i-2]+a[i-1];
		}
		for(i=n-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit");
		int n=s.nextInt();
		rev(n);
		

	}

}
