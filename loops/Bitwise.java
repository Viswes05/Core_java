package loops;
import java.util.*;
public class Bitwise {

	public static void main(String[] args) {
		int x,y,z,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Entert the first value: ");
		x=s.nextInt();
		System.out.println("Entert the second value: ");
		y=s.nextInt();
		System.out.println("Enter any option 1 or 2 or 3 or 4: ");
		z=s.nextInt();
		if(z==1)
		{
			d=x&y;
			System.out.println("Bitwise - AND: ");
			System.out.println(d);
		}
		else if(z==2)
		{
			d=x|y;
			System.out.println("Bitwise - OR: ");
			System.out.println(d);
		}
		else if(z==3)
		{
			d=x^y;
			System.out.println("Bitwise - XOR: ");
			System.out.println(d);
		}
		else if(z==4)
		{
			d=x=~y;
			System.out.println("Bitwise - NOT: ");
			System.out.println(d);
		}
		else
		{
			System.out.println("Wrong value");
		}
		s.close();
		

	}

}
