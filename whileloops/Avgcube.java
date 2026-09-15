package whileloops;

import java.util.Scanner;

public class Avgcube {

	public static void main(String[] args) {
		int x,n,sum=1;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
		int i=1;
		do
		{
			x=i*i*i;
			sum=sum*x;
			i=i+1;
		}while(i<=n);
		avg=sum/n;
		System.out.println("Sum of the Square is: "+avg);
		s.close();

	}

}
