package encaps;

class pro3
{
	public int a=10;
	protected    int b=20;
	public int geta()
	{
		return a;
	}
	public int getb()
	{
		return b;
	}
}

public class Enclass3 extends pro3 {

	public static void main(String[] args) {
		pro3 t=new pro3();
		System.out.println(t.a);
		System.out.println(t.b);
	}

}
