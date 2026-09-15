package forloops;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter the n value: ");
		n=s.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
		s.close();

	}

}
