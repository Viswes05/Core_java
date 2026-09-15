package exceptionhand;
class Testing extends Exception
{
	public Testing(String s)
	{
		System.out.println(s);
	}
}
public class Expppp {

	public static void main(String[] args) {
		{
			try
			{
				throw new Testing("Value sent");
			}
			catch(Testing t)
			{
				System.out.println("Error");
				System.out.println(t.getMessage());
			}
		}
	}

}
