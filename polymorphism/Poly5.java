package polymorphism;
class ops
{
	static int calc(int x,int y)
	{
		int c=x+y;
		return c;
	}
	static int calc(int x, int y,int z)
	{
		int t=x*y*z;
		return t;
	}
}
public class Poly5 {

	public static void main(String[] args) {
		int n=ops.calc(20,60);
		int t=ops.calc(30,50,6);
		System.out.println("Result is "+n);
		System.out.println("Result is "+t);

	}

}
