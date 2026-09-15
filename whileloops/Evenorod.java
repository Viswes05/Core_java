package whileloops;

import java.util.Scanner;

public class Evenorod {

	public static void main(String[] args) {
		int start;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		start=s.nextInt();
		while(start!=1000 && start<1000)
		{
			if(start%2==0)
			{
				System.out.println(start+"IS EVEN ");
			}
			else
			{
				System.out.println(start+"IS ODD");
			}
			System.out.println("Enter the value: ");
			start=s.nextInt();
		}
		s.close();

	}

}
