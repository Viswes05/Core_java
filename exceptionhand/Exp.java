package exceptionhand;

public class Exp {

	public static void main(String[] args) {
		try
		{
			int a=args.length;
			System.out.println(a);
			int x=45;
			int z=x/a;
			System.out.println(z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Wrong value");
		}
	}
}
