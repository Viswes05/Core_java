package oops;
import java.util.Scanner;
public class Add	 {
	int m=100,s=200,r;
	public void add(int x,int y)
	{
		r=x+y;
		System.out.println("Addition value is : " +r);
	}
	public static void main(String[] args) {
		Add n=new Add();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First value: ");
		int a=s.nextInt();
		System.out.println("Enter the Second value:");
		int b=s.nextInt();
		n.add(a,b);
		
	}

}
