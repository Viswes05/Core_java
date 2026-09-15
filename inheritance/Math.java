package inheritance;
import java.util.Scanner;
class C
{
	int m=30,s=50,r;
	C(int x, int y)
	{
		m=x;
		s=y;
	}
	public void add()
	{
		r=m+s;
		System.out.println(" Add : "+r);
	}
	public void sub()
	{
		r=m-s;
		System.out.println("Sub : "+r);
	}
}
class D extends C
{
	int m=30,s=50,r;
	D(int x, int y)
	{
		super(x,y);
	}
	public void rect()
	{
		r=m*s;
		System.out.println("Rectangle value is : "+r);
	}
	public void square()
	{
		r=m*m;
		System.out.println("Square value is : "+r);
	}
}
public class Math extends D
{
	Math(int x,int y)
	{
		super(x,y);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value : ");
		int a=s.nextInt();
		System.out.println("Enter the Second value : ");
		int b=s.nextInt();
		Math d=new Math(a,b);
		d.add();
		d.sub();
		d.rect();
		d.square();
		
	}

}

