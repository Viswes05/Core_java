package array;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int n;
		int a[]=new int[5];
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Result is: ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					{
						System.out.println("Duplicate is "+a[i]);
					}
		}
		}
		s.close();

	}

}
