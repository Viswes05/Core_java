package encaps;

class pro2 
{

	public int a=10;
	public int b=20;
	public int geta()
	{
		return a;
	}
	public int getb()
	{
		return b;
	}
}
public class Enclass2 extends pro2 { 
	public static void main(String[] args) {
		pro2 t=new pro2();
		System.out.println(t.a);
		System.out.println(t.getb());
		
	}

}
