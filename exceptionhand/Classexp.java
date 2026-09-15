package exceptionhand;

public class Classexp {

	public static void main(String[] args) {
		try
		{
			Class.forName("Test");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
			System.out.println("Class Not Found");
		}
	}

}
