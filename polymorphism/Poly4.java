package polymorphism;
class operation 
{
	static int calc(int x,int y)
	{
		int c=x+y;
		return c;
	}
	public float calc(float x, float y)
	{
		float c=x+y;
		return c;
	}
}
public class Poly4 {

	public static void main(String[] args) {
		operation s=new operation();
		float n= s.calc(20.5f, 60.4f);
		int t=s.calc(30, 50);
		System.out.println("Result is "+n);
		System.out.println("Result is "+t);
	}

}
