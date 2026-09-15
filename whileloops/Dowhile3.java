package whileloops;

import java.util.Scanner;

public class Dowhile3 {

	public static void main(String[] args) {
		int x,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ending number: ");
		n=s.nextInt();
		int i=1;
		do
		{
			System.out.println("Enter the year: ");
			x=s.nextInt();
			if(x%4==0)
			{
				System.out.println(x+" is a leap year ");
			}
			else
			{
				System.out.println(x+" is not a leap year ");
			}
		i=i+1;
		}while(i<=n);
		s.close();

	}

}
