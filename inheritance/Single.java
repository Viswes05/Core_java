package inheritance;
class base1
{
	public void display()
	{
		System.out.println("Java Programming");
		System.out.println("Systech Group");
	}
}
public class Single extends base1
{

	public static void main(String[] args) {
			Single s=new Single();
			s.display();
		
	}

}
