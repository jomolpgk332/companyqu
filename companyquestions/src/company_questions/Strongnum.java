package company_questions;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,orgnum,lasnum,sum;
	int fact;
	System.out.println("Enter the digit");
	int num=s.nextInt();
	orgnum=num;
	sum=0;
	while(num>0) {
		lasnum=num%10;
		fact=1;
		for(i=1;i<=lasnum;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	if(sum==orgnum) {
		System.out.println("strong");
	}
	else
	{
		System.out.println("not");
	}
	}

}
