package innerclass;
class base2
{
	void dis()
	{
		System.out.println("Welcome");
	}
	class myclass
	{
		void dis2()
		{
			System.out.println("Everyone");
		}
	}
}
public class Inclass2 {

	public static void main(String[] args) {
		base2 s=new base2();
		base2.myclass m=s.new myclass();
		s.dis();
		m.dis2();
	}

}
