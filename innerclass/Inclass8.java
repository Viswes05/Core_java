package innerclass;
abstract class Mathsfn
{
	abstract void display();
}

public class Inclass8 {

	public static void main(String[] args) 
	{
		Mathsfn s=new Mathsfn()
		{
			void display()
			{
				System.out.println("Hello Welcome");
			}
		};
		s.display();
	}

}
