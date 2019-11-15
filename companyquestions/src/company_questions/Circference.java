package company_questions;
import java.util.*;
import java.math.*;
public class Circference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter radius");
		double radius=s.nextDouble();
		double area=pi*(radius*radius);
		double circ=2*(pi*radius);
		System.out.println("Circumference"+circ);

	}

}
