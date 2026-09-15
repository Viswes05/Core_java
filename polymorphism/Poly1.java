package polymorphism;

class car
{
	public void printing()
	{
		System.out.println("Four wheel drive ");
	}
}
class bike 
{
	public void printing()
	{
		System.out.println("Two Wheel Drive");
	}
}
public class Poly1 {

	public static void main(String[] args) {
		car c=new car();
		bike b=new bike();
		c.printing();
		b.printing();
	}

}
