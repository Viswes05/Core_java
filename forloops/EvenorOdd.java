package forloops;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		for (int i=1;i<=n;i++)
			if(i%2==0)	
				{
					System.out.println(i+" is Even");
				}
			else
			{
				System.out.println(i+" is Odd");
			}
		s.close();

	}

}
