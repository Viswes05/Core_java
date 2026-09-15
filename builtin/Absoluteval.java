package builtin;

import java.util.Scanner;

public class Absoluteval {

	static int abs(int x)
	{
		if(x>0)
		{
		return x;
		}
		else
		{
			return -(x);
		}
	}
	public static void main(String[] args) {
		int n,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		t=abs(n);
		System.out.println("Absolute of "+n+" is "+t);
	}

}
