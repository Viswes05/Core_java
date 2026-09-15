package array;

import java.util.Scanner;

public class Nega {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Positive sum is ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);;
			}
		}
		s.close();

	}

}
