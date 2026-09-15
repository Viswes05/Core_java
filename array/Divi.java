package array;

import java.util.Scanner;

public class Divi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number :");
		int n=s.nextInt();
		int d[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value: ");
				d[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(d[i][j]%3==0)
				{
					System.out.println(d[i][j]+" is Divisibleby 3");
				}
				else
				{
					System.out.println(d[i][j]+" is not Divisible by 3");
				}
				
			}
		}
		s.close();
	}
	

}
