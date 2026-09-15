package oops;
import java.util.Scanner;
class Add2
{
	int m,s,r;
	public void add(int x ,int y)
	{
		m=x;
		s=y;
		r=m+s;
	}
	public void printing()
	{
		System.out.println("Addition value is "+r);
	}
}
public class Arithmeth {

	public static void main(String[] args) {
		Add2 n=new Add2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value: ");
		int b=s.nextInt();
		n.add(a, b);
		n.printing();
	}

}
