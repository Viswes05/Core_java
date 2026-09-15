package oops;

import java.util.Scanner;
class Even1
{
	int x;
	void evenfn(int m)
	{
		x=m;
		if(x%2==0)
		{
			System.out.println("Even Number ");
		}
		else
		{
			System.out.println("Odd Number ");
		}
		
	}
}

public class Even {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		Even1 e=new Even1();
		e.evenfn(a);
	}

}
