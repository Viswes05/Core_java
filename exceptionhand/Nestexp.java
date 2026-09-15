package exceptionhand;

public class Nestexp {

	public static void main(String[] args) {
		try
		{
			int a=args.length;
			int b=10/a;
			System.out.println("a= "+a);
			try
			{
				if(a==1)
					a=a*a;
					System.out.println("Square" +a);
				if(a==2)
				{
					int c[]= {1000};
					c[10]=100;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index: "+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error "+e);
		}
	}
}
