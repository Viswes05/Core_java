package whileloops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Start number: ");
		n=s.nextInt();
		int i=n;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		s.close();
	}
}
