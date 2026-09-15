package whileloops;

import java.util.Scanner;

public class CUbe {

	public static void main(String[] args) {
		int x,n,sum=1;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			x=i*i*i;
			sum=sum*x;
			i=i+1;
		}
		avg=sum/n;
		System.out.println("Sum of the Square is: "+avg);
		s.close();

	}

}
