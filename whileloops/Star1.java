package whileloops;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print("*");
			i++;
		}
		s.close();

	}

}
