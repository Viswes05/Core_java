package whileloops;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the n value : ");
		n=s.nextInt();
		int i=n;
		while(i>0)
		{
			int j=1;
			while(j<=i)
			{
			System.out.print(j);
			j++;
			}
			System.out.print("\n");
			i--;
		}
		s.close();

	}

}
