package whileloops;

import java.util.Scanner;

public class Divornah {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		do
		{
			if(a%3==0)
			{
				System.out.println(a+ "Divisbile by 3");
			}
			else
			{
				System.out.println(a+ "Not Divisbile by 3");
			}
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}while(a!=1000);
			s.close();

	}

}
