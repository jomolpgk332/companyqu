package company_questions;
import java.util.*;
public class Voweldel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		str=str.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
		System.out.println(str);
	}

}
