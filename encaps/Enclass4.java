package encaps;

class pro4
{
	public int a,b=30;
	protected int getA()
	{
		return a;
	}
	protected void setA(int a)
	{
		this.a=a;
	}
	protected int getB()
	{
		return b;
	}
	private void setB(int b)
	{
		this.b = b;
	}
}

public class Enclass4 extends pro4{

	public static void main(String[] args) {
		pro4 s=new pro4();
		s.setA(100);
		System.out.println(s.a);
		System.out.println(s.getA());
		System.out.println(s.b);
	}

}
