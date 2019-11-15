package company_questions;
import java.util.*;
public class Secndlargst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the index");
		int size=s.nextInt();
		int[]values=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		values[i]=s.nextInt();
		for(int i=0;i<size;i++)
		Arrays.parallelSort(values);
		System.out.println(values[size-2]);
	}
}
