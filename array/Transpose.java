package array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter n value: ");
		int n = s.nextInt();
		int c[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value:");
				c[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for( int j=0;j<n;j++)
			{
				System.out.print(c[j][i]);
				System.out.print("\t");
				
			}
			System.out.println("\n");
			s.close();

	}
	}
}
