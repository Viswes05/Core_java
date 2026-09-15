package inheritance;
import java.util.Scanner;
class base5
{
	int m=30,s=50,r;
	base5(int x,int y)
	{
		m=x;
		s=y;
	}
	public void add()
	{
		r=m+s;
		System.out.println("Addition value is: "+r);
	}
	public void sub()
	{
		r=m-s;
		System.out.println("Subtraction value is : "+r);
	}
	public void mul()
	{
		r=m*s;
		System.out.println("Multiplication value is : "+r);
	}
}
public class Singheri extends base5 
{
	Singheri(int x, int y)
	{
		super(x,y);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		Singheri n=new Singheri(a,b);
		n.add();
		n.sub();
		n.mul();
		
	}

}
