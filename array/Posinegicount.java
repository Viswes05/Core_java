package array;

import java.util.Scanner;

public class Posinegicount {

	public static void main(String[] args) {
		int n,pc=0,nc=0;
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
				pc++;
			}
			else
			{
				nc++;
			}
			
		}
		System.out.println("Even count is "+pc);
		System.out.println("Odd count is "+nc);
		s.close();

	}

}
