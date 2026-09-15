package innerclass;
abstract class Dataclass
{
	abstract void display();
	abstract void printing();
	public void entry()
	{
		System.out.println("Value ");
	}
}
public class Inclass7 extends Dataclass
{
	public static void main(String[] args) {
		Inclass7 s= new Inclass7();
		s.display();
		s.printing();
		s.entry();
	}
	@Override
	void display() {
		System.out.println("Display Function");
	}
	@Override
	void printing() {
		System.out.println("Printing Function");
	}

}
