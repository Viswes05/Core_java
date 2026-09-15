package loops;

import java.util.Scanner;

public class Unary {

	public static void main(String[] args) {
		int a,c,opt;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the First value");
		a=s.nextInt();
		System.out.println("Enter the any one opition: 1...2...3...4");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
			c=+a;
			System.out.println("Unary + value..."+c);
			break;
		case 2:
			c=-a;
			System.out.println("Unary - value..."+c);
			break;
		case 3:
			c=++a;
			System.out.println("Unary ++ value..."+c);
			break;
		case 4:
			c=--a;
			System.out.println("Unary -- value..."+c);
			break;
		default:
			System.out.println("Error");
			break;

	}
		s.close();

	}

}
