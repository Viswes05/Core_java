package exceptionhand;

public class NullExp {

	public static void main(String[] args) {
		try
		{
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("Null value Error");
		}
		finally
		{
			String b="Systech";
			System.out.println(b.length());
		}
	}

}
