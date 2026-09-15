package oops;
import java.util.Scanner;
class Arith2
{
	int m=30,s=50,r;
	Arith2()
	{
		System.out.println("Addition value is: "+r);
	}
	public void add(int x,int y)
	{
		r=m+s;
		System.out.println(r);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		Arith2 n=new Arith2();
		n.add(a,b);
	}

}
