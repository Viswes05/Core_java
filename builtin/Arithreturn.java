package builtin;

import java.util.Scanner;

public class Arithreturn {
	
	static int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
	static int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	static int mul(int x,int y)
	{
		int z;
		z=x*y;
		return z;
	}
	static int div(int x,int y)
	{
		int z;
		z=x/y;
		return z;
	}
	public static void main(String[]args) {
		int d,e,f,g;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value:");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		d=add(a,b);
		e=sub(a,b);
		f=mul(a,b);		
		g=div(a,b);
		System.out.println("Add value: "+d);
		System.out.println("Sub value: "+e);
		System.out.println("Mul value: "+f);
		System.out.println("Div value: "+g);
	}
}
