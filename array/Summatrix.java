package array;

import java.util.Scanner;

public class Summatrix {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Enter the value:");
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for( int j=0;j<n;j++)
			{
				sum=sum+a[i][j];
				
			}
		}
			System.out.print("The sum of the matrix is : "+sum);
			s.close();
		}

	}

