package builtin;

import java.util.Scanner;

public class Even {

	public static void even(int x[])
	{
		System.out.println("Result is:");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				System.out.println(x[i]+" is Even");
			}
			else
			{
				System.out.println(x[i]+" is Odd");
			}
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number:");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		even(a);
	}

}
