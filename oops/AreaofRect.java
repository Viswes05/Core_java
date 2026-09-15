package oops;
import java.util.Scanner;
class AreaRect
{
	int m,s,r;
	public void area(int x,int y)
	{
		r=x*y;
		System.out.println("Area of Rectangle is "+r);
	}
}
public class AreaofRect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the L value: ");
		int a=s.nextInt();
		System.out.println("Enter the B value: ");
		int b=s.nextInt();
		new AreaRect().area(a, b);
	}

}
