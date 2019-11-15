package company_questions;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Size of aray");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Number to be searched");
		int q =s.nextInt();
		int j,i,f=0;
		for( i=0;i<=n;i++) {
			if(a[i]==q) {
				j=i;
				f=1;
				break;
			}
			else{
				 f=0;
			}
		}
		if(f!=0) {
			System.out.println(i);
		}
		else {
			System.out.println(-1);
		}
	}

}
