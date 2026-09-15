package lambda;

public class Lambex {
	
	interface funinte
	{
		int operation(int a, int b);
	}
	interface funinte1
	{
		void saymessgae(String message);
	}
	private int operate(int a,int b,funinte fobj)
	{
		return fobj.operation(a, b);
	}

	public static void main(String[] args) {
		funinte add=(int x,int y)-> x+y;
		funinte mul=(int x,int y)-> x*y;
		Lambex tobj = new Lambex();
		System.out.println("Addition is " +tobj.operate(6, 3, add));
		System.out.println("Multi is " +tobj.operate(6, 3, mul));
		funinte1 fobj = message-> System.out.println("Hello "+ message);
		fobj.saymessgae("Systech");

	}

}
