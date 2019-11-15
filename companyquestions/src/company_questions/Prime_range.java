package company_questions;

import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int s1,s2,c=0,i,j;
		System.out.println("Enter the  limit");
		s1=s.nextInt();
		System.out.println("The numbers are");
			for(i=s1;i<=s1;i++) {
				for(j=2;j<i;j++) {
				if(i%j==0 &&(i-2)%j==0) {
				c=0;
				break;
			}
				else
			{
				c=1;
			}
		}
			if(c==1) {
				System.out.printf("(%d,%d)",i,i+2);
			}
	}

}
}
