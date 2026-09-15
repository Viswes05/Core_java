package oops;

import java.util.Scanner;

class Div
{
	void divfn(int m)
	{
		if(m%3==0)
		{
			System.out.println("Divisible by 3");
		}
		else
		{
			System.out.println("Not divisible by 3");
		}
	}
}
public class Dive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		Div d=new Div();
		d.divfn(a);
	}

}
