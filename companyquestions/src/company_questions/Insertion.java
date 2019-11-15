package company_questions;
import java.util.*;
public class Insertion {

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
int n=s.nextInt();
int[]ar=new int[n+1];
int i;
System.out.println("Enter array elements");
for(i=1;i<n;i++)
{
ar[i]=s.nextInt();
}
System.out.println("Enter the position u want to enter");
int pos=s.nextInt();
System.out.println("Enter the Element u want to enter");
int x=s.nextInt();
for(i=n-1;i>=pos-1;i--)
{
ar[i+1]=ar[i];
}
ar[pos-1]=x;
for(i=1;i<n;i++)
{
System.out.println(ar[i]);
}
}

}
