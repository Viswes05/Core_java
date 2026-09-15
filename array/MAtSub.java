package array;

import java.util.Scanner;

public class MAtSub {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n number:");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value; ");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the n number: ");
		int x =s.nextInt();
		int b[][]=new int[x][x];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value: ");
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("\n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
		System.out.print("\n");
		}
		int c[][]=new int[x][x];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Addition of 2 matrices :");
		System.out.print("\n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		s.close();

	}

}
