package array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayvalues {

	public static void main(String[] args) {
		int n,x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Array is: ");
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the particular value: ");
		x=s.nextInt();
		System.out.println("Change new value: ");
		y=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(x==a[i])
			{
				a[i]=y;
			}
		}
		System.out.println("Updated array is: ");
		System.out.println(Arrays.toString(a));
		s.close();
	}

}
