package inheritance;
import java.util.Scanner;
interface Addition
{
	default public void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Addition is "+z);
	}
	default public void sub(int x,int y)
	{
		int z;
		z= x-y;
		System.out.println("Subtraction is "+z);
	}
}
interface Operation
{
	default public void mul(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("Multiplication is "+z);
	}
	default public void div(int x,int y)
	{
		int z;
		z= x/y;
		System.out.println("Division is "+z);
	}
}
public class Interf implements Addition,Operation {

	public static void main(String[] args) {
		int s,t;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the First num: ");
		s=k.nextInt();
		System.out.println("Enter Second num: ");
		t=k.nextInt();
		Interf r=new Interf();
		r.add(s, t);
		r.sub(s, t);
		r.mul(s, t);
		r.div(s, t);
		
		
	}

}
