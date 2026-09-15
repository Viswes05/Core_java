package array;
import java.util.Scanner;
public class PosNeg {

	public static void main(String[] args) {
		int n,ps=0,ns=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				ps=ps+a[i];
			}
			else
			{
				ns=ns-a[i];
			}
			
		}
		System.out.println("Positive sum is "+ps);
		System.out.println("Negative sum is "+(-ns));
		s.close();

	}

}
