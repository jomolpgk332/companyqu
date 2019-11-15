package company_questions;

import java.util.Scanner;

public class Duplicate {
	
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[]a=new int[size];
		int j;
		System.out.println("enter  array elmentss");
		for(int i=1;i<size;i++)
		{
		a[i]=s.nextInt();
		}
		for(int i=1;i<size;i++)
		{
		for(j=i+1;j<size;j++)
		{
		if(a[i]==a[j])
		{
		System.out.println(a[j]);

		}
		}
		}
		}
		}


