package company_questions;
import java.util.Scanner;
public class Maxelmnt {
	    public static void main(String args[])
	    {
	        Scanner s=new Scanner(System.in);
			System.out.println("Enter the index");
			//int b=s.nextInt();
			int size=s.nextInt();
			System.out.println("Enter the elements");
			int[]values=new int[size];
			
			for(int i=0;i<size;i++)
				values[i]=s.nextInt();
				int max=0;
				for(int i=0;i<size;i++)
				{
					if(values[i]>max)
					{
						max=values[i];
					}
				}
				System.out.println(max+ " is the maximum element in the array");
	    }
}
