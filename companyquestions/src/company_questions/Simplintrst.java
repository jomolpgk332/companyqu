package company_questions;
import java.util.Scanner;
public class Simplintrst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int amount=s.nextInt();
		System.out.println("Enter the number of years");
		int year=s.nextInt();
		System.out.println("Enter the rate");
		int rate=s.nextInt();
		int i=((amount*year*rate)/100);
		System.out.println("Interest "+i);
	}

}
