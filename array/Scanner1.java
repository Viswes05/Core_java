package array;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		int n;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value; ");
			a[i]=s.nextInt();
			
		}
		System.out.println("Result is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		s.close();

	}

}
