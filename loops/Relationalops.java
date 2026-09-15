package loops;

import java.util.Scanner;

public class Relationalops {

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
			if(a==b)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not ");
			}
			break;
		case 2:
			System.out.println("Greater than condition");
			if(a>b)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("B is greater");
			}
			break;
		default:
			System.out.println("Error");
			break;

	}
		s.close();
}
}
