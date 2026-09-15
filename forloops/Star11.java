package forloops;

import java.util.Scanner;

public class Star11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the n value: ");
		n=s.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=a;k++)
			{
			System.out.print("*");
			}
			a=a+2;
			System.out.print("\n");
		}
		s.close();
	}
}
