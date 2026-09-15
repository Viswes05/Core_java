package array;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number : ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
			{	
			System.out.println(a[i]+" is Even");
			}
			else
			{
				System.out.println(a[i]+" is Odd");
			}
		s.close();
	}

}
