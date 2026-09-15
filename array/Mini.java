package array;
import java.util.Arrays;
import java.util.Scanner;

public class Mini {

	public static void main(String[] args) {
		int n,m;
		int a[]=new int[5];
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Array is ");
		System.out.println(Arrays.toString(a));
		m= a[0];
		for(int i=0;i<a.length;i++)
		{
			if(m>a[i])
			{
				m=a[i];
			}
		}
		System.out.println("Minimum value: "+m);
		s.close();

	}

}
