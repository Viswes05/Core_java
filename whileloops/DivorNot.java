package whileloops;

import java.util.Scanner;

public class DivorNot {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		while(a!=500)
		{
			if(a%3==0)
			{
				System.out.println(a+"Divisible by 3");
			}
			else
			{
				System.out.println(a+"not Divisible by 3");
			}
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}
		s.close();

	}

}
