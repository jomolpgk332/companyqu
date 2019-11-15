package company_questions;
import java.util.Scanner;
public class Highfrqchar {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String str=s.next();
char ch=s.next().charAt(0);
int fr=0;
for(int i=0;i<str.length();i++) {
	if(ch==str.charAt(i)) {
		++fr;
	}
}
System.out.println(fr);
	}
}
