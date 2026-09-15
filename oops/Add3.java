package oops;
import java.util.Scanner;
public class Add3
{
		int m,s,r;
		public void add(int x ,int y)
		{
			m=x;
			s=y;
			r=m+s;
			System.out.println("Addition value is "+r);
		}
public static void main(String[] args) {
	Add3 n=new Add3();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the First value: ");
	int a=s.nextInt();
	System.out.println("Enter the Second value: ");
	int b=s.nextInt();
	n.add(a, b);
}
}
