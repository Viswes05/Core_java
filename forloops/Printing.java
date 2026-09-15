package forloops;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n Numbers: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		s.close();

	}

}
