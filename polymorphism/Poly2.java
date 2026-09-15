package polymorphism;
class arith
{
	public void calc()
	{
		
	}
}
class add extends arith
{
	public void calc()
	{
		int a=30,b=50,c;
		c=a+b;
		System.out.println("Addition result "+c);
	}
}
class sub extends arith
{
	public void calc()
	{
		float a=80.5f,b=50.6f,c;
		c=a+b;
		System.out.println("Addition result: "+c);
	}
}
public class Poly2 {

	public static void main(String[] args) {
		arith s;
		s=new sub();
		s.calc();
		

	}

}
