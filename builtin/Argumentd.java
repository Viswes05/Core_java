package builtin;

import java.util.Scanner;

public class Argumentd {

	static void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("Add of Two numbers is: "+z);
	}
	static void sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub of Two numbers is: "+z);
	}
	static void mul(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("Mul of Two numbers is: "+z);
	}
	static void div(int x,int y)
	{
		int z;
		z=x/y;
		System.out.println("Div of Two numbers is: "+z);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
	}

}
