package oops;

import java.util.Scanner;

class Fact1
{
	void factfn(int m)
	{
		int fac=1;
		for(int i=1;i<=m;i++)
		{
			fac*=i;
		}
		System.out.println("Factorial value is "+fac);
	}
}

public class Facto {

	public static void main(String[] args) {
		Fact1 f=new Fact1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		f.factfn(a);
	}

}
