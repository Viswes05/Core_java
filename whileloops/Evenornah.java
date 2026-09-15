package whileloops;

import java.util.Scanner;

public class Evenornah {

	public static void main(String[] args) {
		int start;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		start=s.nextInt();
		do
		{
			if(start%2==0)
			{
				System.out.println(start + "Even");
			}
			else
			{
				System.out.println(start + "Odd");
			}
			System.out.println("Enter the value: ");
			start=s.nextInt();
		}while(start!=1000 && start<1000);
			s.close();

	}

}
