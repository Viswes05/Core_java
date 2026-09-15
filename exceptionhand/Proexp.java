package exceptionhand;

public class Proexp {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int c=a/0;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error "+e);
		}
		System.out.println("Completed");
	}

}
