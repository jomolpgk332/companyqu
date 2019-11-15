package company_questions;

import java.util.Scanner;

public class Leapyr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		if(year%400==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
			
	}

}
