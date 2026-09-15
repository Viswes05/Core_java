package innerclass;
abstract class person
{
	abstract void eat();
}
public class Anonym {

	public static void main(String[] args) {
		person p=new person()
				{
					@Override
					void eat()
					{
						System.out.println("Hello");
					}
				};
				p.eat();
	}

}
