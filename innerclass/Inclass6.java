package innerclass;
 class Abs
{
	public int x=100,y=200;
	public int n=500;
	public void dis1()
	{
		System.out.println("Data Stored");
	}
	public void dis2()
	{
		System.out.println("Data Deleted");
	}
	private void dis3()
	{
		System.out.println("Data Copied");
	}
}
public class Inclass6 extends Abs
{

	public static void main(String[] args) {
		Inclass6 s=new Inclass6();
		s.dis1();
		s.dis2();
		int e=s.y;
		System.out.println(e);
	}

}
