package whileloops;

import java.util.Scanner;

public class Dowhile5 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		do {
			System.out.println("The value is : "+n);
			System.out.println("Enter the value : ");
			n=s.nextInt();
		}while(n!=2000);
		s.close();

	}

}
