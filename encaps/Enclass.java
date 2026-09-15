package encaps;
class pro1
 {
	 private int a=10,b=20;
	 public int geta()
	 {
		 return a;
	 }
	 public int getb()
	 {
		 return b;
	 }
 }
public class Enclass extends pro1
{

	public static void main(String[] args) 
	{
		pro1 t=new pro1();
		System.out.println(t.geta());
		System.out.println(t.getb());
	}

}
