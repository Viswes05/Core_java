package loops;

import java.util.Scanner;

public class Arithmeticops {

	public static void main(String[] args) {
		int a,b,c,opt;
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
			c=a+b;
			System.out.println("Addition value is"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Subtraction value is"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication value is"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division value is"+c);
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		s.close();

	}

}
