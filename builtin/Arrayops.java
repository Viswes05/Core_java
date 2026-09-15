package builtin;
import java.util.Scanner;
public class Arrayops 
{
	public static void printing(int x[])
	{
		System.out.println("Result is: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		printing(a);
	}

}
