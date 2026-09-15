package whileloops;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
		i=1;
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
			System.out.print(" ");
			j++;
			}
			int k=i;
			while(k<=n)
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
