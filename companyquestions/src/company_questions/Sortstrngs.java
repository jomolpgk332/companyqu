package company_questions;

import java.util.Scanner;

public class Sortstrngs {
	public static void main(String args[]) 
    { 
		Scanner s=new Scanner(System.in);
		
		String inputString;
        // convert input string to char array 
		System.out.println("Enter the string");
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        System.out.println();
        new String(tempArray); 
    } 
}
