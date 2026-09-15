package loops;

import java.util.Scanner;

public class Mathematicalops {
	
	public static void main(String[] args) {
		int a,b,opt;
		float c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value: ");
		a=s.nextInt();
		System.out.println("Enter the second value: ");
		b=s.nextInt();
		System.out.println("Enter any option (1,2,3,4): ");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
			System.out.println("Area of square");
			c=a*a;
			System.out.println("Result is "+c);
			break;
		case 2:
			System.out.println("Area of Rectangle");
			c=a*b;
			System.out.println("Result is "+c);
			break;
		case 3:
			System.out.println("Area of Circle");
			float pi=3.14f;
			c=pi*a*a;
			System.out.println("Result is "+c);
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		s.close();
		
	}

}
