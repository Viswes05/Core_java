package whileloops;

import java.util.Scanner;

public class Leapyrooo {

	public static void main(String[] args) {
		int x,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start value: ");
		x=s.nextInt();
		System.out.println("Enter the end value: ");
		n=s.nextInt();
		do
		{
			if(x%4==0)
			{
				System.out.println(x+ "Leap");
			}
			else
			{
				System.out.println(x+ "Not Leap ");
			}
			x=x+1;
		}while(x<=n);
			s.close();

	}

}
