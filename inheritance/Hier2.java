package inheritance;
import java.util.Scanner;
class I
{
	int x,y,z;
	void add(int m,int n)
	{
		x=m;
		y=n;
		z=x+y;
		System.out.println("Add "+z);
	}
	void sub(int m,int n)
	{
		x=m;
		y=n;
		z=x-y;
		System.out.println("Sub "+z);
	}
}
class J extends I
{
	public static void main(String[] args) 
	{
		int a=100,b=200;
		J e=new J();
		e.add(a, b);
	}
}

public class Hier2 extends I {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("First value: ");
		int d=s.nextInt();
		System.out.println("Second value: ");
		int e=s.nextInt();
		Hier2 t=new Hier2();
		t.sub(d, e);
	}

}
