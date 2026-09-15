package builtin;

import java.util.Scanner;

public class Leapyear {

	public static void leap(int x[])
	{
		System.out.println("Result is :");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%4==0)
			{
				System.out.println(x[i]+" is Leap year");
			}
			else
			{
				System.out.println(x[i]+" is not Leap year");
			}
		}

	}
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		leap(a);
	}

}
