package array;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		int n,ec=0,oc=0;
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
			if(a[i]%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}
			
		}
		System.out.println("Even count is "+ec);
		System.out.println("Odd count is "+oc);
		s.close();
	}

}
