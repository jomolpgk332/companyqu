package company_questions;
import java.util.*;
public class Distinct {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size");
int n=s.nextInt();
int[]a=new int[n];
int j,i;
System.out.println("enter  array elmentss");
for(i=1;i<n;i++)
{
a[i]=s.nextInt();
}
for (i = 1; i < n; i++) {
        for (j = 1; j < i; j++)
           if (a[i] == a[j])
              break;
           if (i == j)
              System.out.print( a[i] + " ");
}
}
}

