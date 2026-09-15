package loops;

import java.util.Scanner;

public class Sumofsquares {

	public static void main(String[] args) {
		int a,opt;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		System.out.println("Enter any option : 1...2...");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
			System.out.println("Even operation");
			if(a%2==0)
			{
				System.out.println("EVEN");
			}
			else
			{
				System.out.println("ODD");
			}
			break;
		case 2:
			System.out.println("Divisible by 3");
			if(a%3==0)
			{
				System.out.println("Divisible");
			}
			else
			{
				System.out.println("Not Divisible");
			}
			break;
		default:
			System.out.println("Error");
			break;
		}
		s.close();
		

	}

}
