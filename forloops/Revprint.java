package forloops;

import java.util.Scanner;

public class Revprint {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Emter n numbers: ");
		n=s.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.println(i);
		}
		s.close();

	}

}
