package inheritance;

import java.util.Scanner;

class base6
{
	int m=30,s=50,r;
	base6(int x,int y)
		{
			m=x;
			s=y;
		}
		public int add()
		{
			r=m+s;
			return r;		
		}
		public int sub()
		{
			r=m-s;
			return r;		
		}
}
public class Arith3 extends base6 
{
	Arith3(int x, int y)
	{
		super(x,y);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		Arith3 n=new Arith3(a,b);
		int t=n.add();
		int u=n.sub();
		System.out.println("Addition value: "+t);
		System.out.println("Subtraction value is "+u);
	}

}
