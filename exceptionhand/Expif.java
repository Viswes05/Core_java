package exceptionhand;

public class Expif {
	
	public static void agecalc(int age)
	{
		if(age>30)
		{
			throw new ArithmeticException("This Person not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		agecalc(25);
	}

}
