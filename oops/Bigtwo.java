package oops;
import java.util.Scanner;
class Big
{
	int x,y;
	void bigfn(int m,int v)
	{
		x=m;
		y=v;
		if(x>y)
		{
			System.out.println("First value is the Biggest ");
		}
		else
		{
			System.out.println("Second value is the biggest");
		}
	}
}
public class Bigtwo {

	public static void main(String[] args) {
		Big n=new Big();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		n.bigfn(a,b);
	}

}
