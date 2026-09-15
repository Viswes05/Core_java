package builtin;
import java.util.Scanner;
public class Fact {

	static int store(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int x,m;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		x=s.nextInt();
		m=store(x);
		System.out.println("Factorial of n number: "+ m);
	}

}
