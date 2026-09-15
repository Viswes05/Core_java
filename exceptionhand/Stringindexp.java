package exceptionhand;

public class Stringindexp {

	public static void main(String[] args) {
		String a ="This is like Chipping";
		try
		{
			char c =a.charAt(24);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception");
			char s=a.charAt(10);
			System.out.println(s);
		}
	}

}
