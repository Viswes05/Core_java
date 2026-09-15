package array;

import java.util.Scanner;

public class SumEVOD {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int esum=0,osum=0;
		System.out.println("Enter the n Number: ");
		int n =s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				System.out.println("Enter the value: ");
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (a[i][j]%2==0)
				{
					esum=esum+a[i][j];
				}
				else
				{
					osum=osum+a[i][j];
				}
			}
		}
			System.out.println(" count Even "+esum);
			System.out.println(" count odd "+osum);
			s.close();
			}
	}


