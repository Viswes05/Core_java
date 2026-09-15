package whileloops;

import java.util.Scanner;

public class Star12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the n value: ");
		n=s.nextInt();
		int a=1;
		i=1;
		while(i<=n)
		{
			j=i;
			while(j<=n)
			{
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=a)
			{
				System.out.print("*");
				k++;
			}
			System.out.print("\n");
			i++;
			a=a+2;
		}
		s.close();

	}

}
