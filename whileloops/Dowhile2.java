package whileloops;

import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		int start,end;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting number: ");
		start=s.nextInt();
		System.out.println("Enter the ending number: ");
		end=s.nextInt();
		do
		{
			if(start%2==0)
			{
				System.out.println(start+"IS even ");
			}
			else
			{
				System.out.println(start+"IS Odd");
			}
		start=start+1;
		}while(start<=end);
		s.close();
	

	}

}
