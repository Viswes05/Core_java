package oops;
import java.util.Scanner;
class Pconst
{
	int m=30,s=50,r;
	Pconst(int x,int y)
	{
		m=x;
		s=y;
		System.out.println("Addition value is: ");
	}
	public void add()
	{
		r=m+s;
		System.out.println(r);
	}
}
public class Pcons {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		Pconst n=new Pconst(a,b);
		n.add();
	}

}
