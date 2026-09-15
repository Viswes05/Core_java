package inheritance;
import java.util.Scanner;
class A
{
	public int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
}
class B extends A
{
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}
}
public class Multi3 extends B
{

	public static void main(String[] args) 
	{
		Multi3 v=new Multi3();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int d=s.nextInt();
		System.out.println("Enter the Second number: ");
		int e=s.nextInt();
		int k=v.add(d, e);
		int r=v.sub(d, e);
		System.out.println("Adding 2 value: "+k);
		System.out.println("Subtraction of 2 value "+r);
		
	}

}

