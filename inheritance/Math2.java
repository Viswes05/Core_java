package inheritance;
class E
{
	int m=30,s=50,r;
	E(int x, int y)
	{
		m=x;
		s=y;
	}
	public void add()
	{
		r=m+s;
		System.out.println("Add : "+r);
	}
	public void sub()
	{
		r=m-s;
		System.out.println("Sub : "+r);
	}
}
class F extends E
{
	int m=5;
	int s=8;
	F(int x, int y)
	{
		super(x,y);
	}
	public void rect()
	{
		r=super.m*super.s;
		System.out.println("Rectangle value is : "+r);
	}
	public void square()
	{
		r=super.m*super.m;
		System.out.println("Square value is : "+r);
	}
}
public class Math2 extends F
{
	Math2(int x,int y)
	{
		super(x,y);
	}
	public static void main(String[] args) 
	{
		Math d=new Math(30,60);
		d.add();
		d.sub();
		d.rect();
		d.square();
		
	}

}

