package forloops;

import java.util.Scanner;

public class Averagemarks {

	public static void main(String[] args) {
		int a,b,c,d,e,n,sum;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N numbers: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Tamil Mark: ");
			a=s.nextInt();
			System.out.println("Enter English Mark: ");
			b=s.nextInt();
			System.out.println("Enter Maths Mark: ");
			c=s.nextInt();
			System.out.println("Enter Science Mark: ");
			d=s.nextInt();
			System.out.println("Enter Social science Mark: ");
			e=s.nextInt();
			sum=a+b+c+d+e;
			avg=sum/n;
			if(avg>70)
			{
				System.out.println("First Grade");
			}
			else if((avg>40)&&(avg<70))
			{
				System.out.println("Second Grade");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		s.close();
	}

}
