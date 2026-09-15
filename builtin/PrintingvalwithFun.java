package builtin;

import java.util.Scanner;

public class PrintingvalwithFun {

	public static int[] printing(int t)
	{
		int x[]=new int[t];
		Scanner s=new Scanner (System.in);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Enter the value: ");
			x[i]=s.nextInt();
		}
		return x;
	}
	static void display(int m[])
	{
		System.out.println("Result is: ");
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int a[]=new int [n];
		a=printing(n);
		display(a);
	}

}
