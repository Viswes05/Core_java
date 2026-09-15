package whileloops;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int a,x=0,y=0,z=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		while(a!=1000)
		{
			if(a>0)
			{
				x=x+1;
			}
			else if(a<0)
			{
				y=y+1;
			}
			else
			{
				z=z+1;
			}
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}
		System.out.println("Positive : "+x);
		System.out.println("Negative : "+y);
		System.out.println("Zero     : "+z);
		s.close();
	}

}
