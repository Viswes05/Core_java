package loops;

import java.util.Scanner;

public class Logicalops {

	public static void main(String[] args) {
		int a,b,opt;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the First value");
		a=s.nextInt();
		System.out.println("Enter the Second value");
		b=s.nextInt();
		System.out.println("Enter the any one opition: 1...2...3...4");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
			System.out.println("AND");
			if((a>0)&&(b>0))
			{
				System.out.println("Both values are positive");
			}
			else
			{
				System.out.println("Negative value");
			}
			break;
		case 2:
			System.out.println("NOT");
			if(!(a==0))
			{
				System.out.println("Both values are positive");
			}
			else
			{
				System.out.println("Negative value");
			}
			break;
		case 3:
			System.out.println("OR");
			if((a>0)||(b>0))
			{
				System.out.println("Both values are positive");
			}
			else
			{
				System.out.println("Negative value");
			}
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		s.close();

	}

}
