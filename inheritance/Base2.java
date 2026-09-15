package inheritance;

class Base3 {
	int x=100;
	int y=200;
	int z=0;
	public void add()
	{
		z=x+y;
		System.out.println("Sum of two numbers: "+z);
	}
}
public class Base2 extends Base3
{
	public static void main(String[]args)
	{
		Base2 a=new Base2();
		a.add();
	}
}