package whileloops;

import java.util.Scanner;

public class Leapyr {

	public static void main(String[] args) {
		int x,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  Start year: ");
		x=s.nextInt();
		System.out.println("Enter the End year: ");
		n=s.nextInt();
		while(x<=n)
		{
			if(x%4==0)
			{
				System.out.println(x+"is Leap year");
			}
			else
			{
				System.out.println(x+"not Leap year");
			}
			x=x+1;
		}
		s.close();

	}

}
