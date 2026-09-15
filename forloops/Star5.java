package forloops;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter the n value: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*");
			}
				System.out.print("\n");
		}
		s.close();

	}

}
