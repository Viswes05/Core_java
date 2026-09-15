package oops;

import java.util.Scanner;
class swcase
{
	void oper(int x,int y,int z)
	{
		int result;
		switch(z)
		{
		case 1:
			result = x+y;
			System.out.println("Result is "+result);
			break;
		case 2:
			result = x-y;
			System.out.println("Result is "+result);
			break;
		case 3:
			result = x*y;
			System.out.println("Result is "+result);
			break;
		case 4:
			result = x/y;
			System.out.println("Result is "+result);
			break;
		}
	}
}

public class Switchcase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		System.out.println("Enter the Case: ");
		int c=s.nextInt();
		swcase c1=new swcase();
		c1.oper(a, b, c);
		
	}

}
