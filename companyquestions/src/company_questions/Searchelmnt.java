package company_questions;
import java.util.Scanner;
public class Searchelmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,flag=0,i=0,x;
		System.out.println("Enter the number of elements in array");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the elements to be searched");
		x=s.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				break;
		}
			else
			{
				flag=0;
			}
		}
			if(flag==1) {
				System.out.println("Element at position"+(i+1));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}

