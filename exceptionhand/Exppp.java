package exceptionhand;

public class Exppp {

	public static void main(String[] args) {
		try
		{
			int a=args.length;
			System.out.println(a);
			int x=45;
			int z=x/a;
			System.out.println(z);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong value");
		}
		finally
		{
			int m=20;
			int n=50;
			int r=m+n;
			System.out.println("Result is "+r);
		}
	}

}
