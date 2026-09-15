package inheritance;
import java.util.Scanner;

interface Inter1
{
	default public void add(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("Addition is "+z);
	}
}
interface Inter2 extends Inter1
{
	default public void mul(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("Multiplication is "+z);
	}
}
public class Interheri implements Inter2 
{
public static void main(String[] args) {
	int s,t;
	Scanner k=new Scanner(System.in);
	System.out.println("Enter the First num: ");
	s=k.nextInt();
	System.out.println("Enter Second num: ");
	t=k.nextInt();
	Interheri r=new Interheri();
	r.add(s, t);
	r.mul(s, t);
}
}
