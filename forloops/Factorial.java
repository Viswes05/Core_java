package forloops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		if(n<0)	
			{
				System.out.println("Enter coreect value");
			}
		else
			{
				for(int i=1;i<=n;i++)
				{
					fact *=i;
				}
			}
		System.out.println("Factorial value is "+fact);
		s.close();

	}

}
