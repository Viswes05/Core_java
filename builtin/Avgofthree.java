package builtin;

import java.util.Scanner;

public class Avgofthree {

	public static int avg(int x[])
	{
		int r=0;
		for(int i=0;i<x.length;i++)
		{
			r=r/x[i];
		}
		return r;
	}
	public static void main(String[] args) {
		int n,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number:");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		t=avg(a);
		System.out.println("avg of array is: "+ t);
	}

}
