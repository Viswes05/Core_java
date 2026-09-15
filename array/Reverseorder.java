package array;
import java.util.Scanner;
public class Reverseorder {

	public static void main(String[] args) {
		int n;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number : ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Resullt is: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		s.close();
	}

}
