package company_questions;

import java.util.Scanner;

public class Gcdarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		
		 System.out.println("Enter the fist digit");
		 int a=s.nextInt();
		 System.out.println("Enter the second digit");
		 int b=s.nextInt();
	      int[] myArray = new int[20];
	      int size = myArray.length;
	      int result = myArray[0];
	      int i = 1;
	      while(i<size)
	      {
	         if(myArray[i]%result==0)
	         {
	            i++;
	         } else {
	            result = myArray[i]%result;
	            i++;
	         }
	      }
	      System.out.println("GCD is "+result);

	}

}
