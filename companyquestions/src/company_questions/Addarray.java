package company_questions;
import java.util.Scanner;
public class Addarray {
	
	
	    public static void main(String args[])
	    {
	       		Scanner s=new Scanner(System.in);
	System.out.println("Enter the index");
	//int b=s.nextInt();
	int size=s.nextInt();
	int size1=s.nextInt();
	
	System.out.println("Enter the first array");
	int[]values=new int[size];
	System.out.println("Enter the second array");
	int[]value=new int[size1];
	
	
	for(int i=0;i<size;i++)
	{
		
		values[i]=s.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		value[i]=s.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		System.out.print(values[i]+value[i]);
		
	}
	    }
}

