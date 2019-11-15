package company_questions;
import java.util.Scanner;
public class Primefactrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit");
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			System.out.println(i+" ");
			n=n/2;
		}
		if(n<2) {
			System.out.println(n);
		}
	}

}
