package whileloops;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
		i=n;
		while(i>0)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i--;
		}
		s.close();

	}

}
