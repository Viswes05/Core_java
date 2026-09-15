package exceptionhand;

public class Arrayindexp {

	public static void main(String[] args) {
		
		try
		{
			int[] a=new int[6];
			int i = a[6];
			System.out.println("Array is "+i);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Error "+ar);
		}
		
	}
}
