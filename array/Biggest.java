package array;

import java.util.Arrays;
import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		int n,m,x=0;
		int a[]= new int[5];
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
			
		}
		System.out.println("Array is:");
		System.out.println(Arrays.toString(a));
		m=a[0];
		for(int i=0;i<n;i++)
		{
			if(m<a[i])
			{
				m=a[i];
				x=i;
			}
		}
		System.out.println("Biggest value position is: "+x);
		s.close();

	}

}
