package whileloops;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
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
			while(k<=i)
			{
			System.out.print("*");
			k++;
			}
			System.out.print("\n");
			i++;
		}
		s.close();

	}

}
