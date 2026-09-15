package whileloops;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the n value : ");
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
				System.out.print(k);
				k++;
			}
			System.out.print("\n");
			i++;
		}
		s.close();

	}

}
