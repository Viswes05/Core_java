package innerclass;
class Lclass
{
	private int data=30;
		void display()
		{
			class Local
			{
				void msg()
					{
					System.out.println(data);
					}
			}
			Local l=new Local();
			l.msg();
		}
}
public class Inclass3 {

	public static void main(String[] args) {
		Lclass l=new Lclass();
		l.display();
	}

}
