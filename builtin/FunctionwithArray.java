package builtin;

import java.util.Scanner;

public class FunctionwithArray {

	public static int[] printing(int t)
	{
		int x[]=new int[t];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the value: ");
			x[i]=s.nextInt();
		}
		return x;
	}
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n numbers:");
		n=s.nextInt();
		int a[]=new int[n];
		a=printing(n);
		System.out.println("Result is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	} 
}
