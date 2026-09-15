package whileloops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int start,end,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Start number: ");
		start=s.nextInt();
		System.out.println("Enter the End number: ");
		end=s.nextInt();
		System.out.println("Enter the Searching number: ");
		k=s.nextInt();
		int i=start;
		while(i<=end)
		{
			if(i==k)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		
		s.close();

	}

}
