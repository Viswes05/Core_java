package inheritance;
import java.util.Scanner;
class Base4
{
	public int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
}

public class Adding2 extends Base4
{
	public static void main(String[] args) {
		Adding2 m=new Adding2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int d=s.nextInt();
		System.out.println("Enter the Second value: ");
		int e=s.nextInt();
		int k=m.add(d, e);
		System.out.println("Adding 2 value: "+k);
		
	}

}
