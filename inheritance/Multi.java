package inheritance;
class base7
{
	public void display()
	{
		System.out.println("Sum of Two Numbers: ");
	}
}
class bas extends base7
{
	public void display2()
	{
		System.out.println("Sub of Two Numbers: ");
	}
}
public class Multi extends bas {

	public static void main(String[] args) {
		Multi d= new Multi();
		d.display();
		d.display2();
	}

}

