package array;

import java.util.Arrays;
import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		int n,t;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Array is: ");
		System.out.println(Arrays.toString(a));
		System.out.println("Enter Finding number: ");
		t=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==t)
			{
				System.out.println("Position is: "+i);
			}
		}s.close();
	}

}
