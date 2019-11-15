
package company_questions;

import java.util.Scanner;
public class Dectooctal
 {
static int i=1;
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the decimal value");
int dec=s.nextInt();
System.out.println("Octal value is:");
int []oct=octal(dec);
for(int c=i-1;c>0;c--) {
	System.out.print(oct[c]);
	}
}
static int[] octal(int q){
	int a[]=new int[50];
	while(q!=0) {
		a[i++]=q%8;
		q=q/8;
		//
	}
	return a;
}
}
