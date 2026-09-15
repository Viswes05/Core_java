package whileloops;

import java.util.Scanner;

public class Cubeee {

	public static void main(String[] args) {
		int x,n,sum=1;
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
		System.out.println("Sum of the Square is: "+sum);
		s.close();

	}

}
