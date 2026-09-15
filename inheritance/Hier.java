package inheritance;
class G
{
	int x=100;
	int y=200;
}
class H extends G
{
	public static void main(String[] args) 
	{
		H h1=new H();
		System.out.println("Value is "+h1.x);
	}

}
public class Hier extends G {

	public static void main(String[] args)
	{
		Hier h2 = new Hier();
		System.out.println("Value is "+h2.y);
	}

}
