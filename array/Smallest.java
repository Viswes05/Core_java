package array;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		int n=s.nextInt();
		int d[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value");
				d[i][j]= s.nextInt();
			}
		}
		int x=d[0][0];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(x>d[i][j])
				{
					x=d[i][j];
				}
			}
		}
		System.out.println("Bigggest element is : "+x);
		s.close();
	}

}
