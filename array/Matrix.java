package array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter n value: ");
		int n = s.nextInt();
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value:");
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for( int j=0;j<n;j++)
			{
				System.out.print(b[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("\n");
			s.close();
		}
		
	}

}
