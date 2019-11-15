package company_questions;

import java.util.Scanner;

public class Tempcentigrde {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ente the temperature");
		float c=s.nextFloat();
		float F=c*(9f/5)+32;
		System.out.println(F);
	}

}
