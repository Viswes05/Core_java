package builtin;

import java.util.Scanner;

public class Function3 {

	static void adding(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("Sum of two numbers:"+z);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		adding(a,b);
	}

}
