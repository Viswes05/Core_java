package innerclass;
class base1
{
	public class myclass
	{
		void display()
		{
			System.out.println("Welcome to systech");
		}
	}
}
public class Inclass1 extends base1 {

	public static void main(String[] args) {
		base1 s=new base1();
		base1.myclass m=s.new myclass();
		m.display();
	}

}
