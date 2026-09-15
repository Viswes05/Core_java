package whileloops;

import java.util.Scanner;

public class Dowhile8Doop {

	public static void main(String[] args) {
		int a,b,c,d,e,n,sum;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n Number: ");
		n=s.nextInt();
		int i=1;
		do
		{
			System.out.println("Enter the 1 Number: ");
			a=s.nextInt();
			System.out.println("Enter the 2 Number: ");
			b=s.nextInt();
			System.out.println("Enter the 3 Number: ");
			c=s.nextInt();
			System.out.println("Enter the 4 Number: ");
			d=s.nextInt();
			System.out.println("Enter the 5 Number: ");
			e=s.nextInt();
			sum=a+b+c+d+e;
			avg=sum/n;
			System.out.println("average of 5 value is :"+avg);
		}while(i<=n);
		s.close();

	}

}
