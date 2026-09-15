package oops;

import java.util.Scanner;

class Mod {

	int j,k,l;
	public void func(int x,int y)
	{
		j=x;
		k=y;
		l=j%k;
		System.out.println("Area Of Rectangle is "+l);
	}
}
	public class Modulus
	{
		public static void main(String[] args) {
		Mod g1=new Mod(), g2=new Mod();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the 1st value: ");
		int a=s.nextInt();
		System.out.println("Enter the 2nd value: ");
		int b=s.nextInt();
		g1.func(a, b);
		g2.func(100, 200);
	}
	}

