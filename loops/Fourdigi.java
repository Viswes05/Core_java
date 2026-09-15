package loops;
import java.util.*;
public class Fourdigi {

	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		x=s.nextInt();
		if (x>=0 == x<=9)
		{
			System.out.println("Single digit");
		}
		else if(x>=10 && x<=99)
		{
			System.out.println("Two digit number");
		}
		else if(x>=100 && x<=999)
		{
			System.out.println("Three digit number");
		}
		else if(x>=1001 && x<=9999)
		{
			System.out.println("Four digit number");
		}
		else
		{
			System.out.println("Error");
		}
		s.close();
		

	}

}
