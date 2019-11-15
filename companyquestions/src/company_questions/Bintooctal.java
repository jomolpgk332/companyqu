
package company_questions;

import java.util.Scanner;
 class BinOctal
 {
	Scanner s=new Scanner(System.in);
	int num;
	void getVal() 
	{
        System.out.println("Binary to Octal");
 	    System.out.println("\nEnter the number :");
	    num = Integer.parseInt(s.nextLine(), 2);
	}
	void convert() 
	{
	        String octal = Integer.toOctalString(num);
	       System.out.println("Octal Value is : " + octal);
	}
 }
class Bintooctal
{
  public static void main(String args[]) 
    {
        BinOctal obj = new BinOctal();
        obj.getVal();
        obj.convert();
}
}
