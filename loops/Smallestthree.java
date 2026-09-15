package loops;
import java.util.*;
public class Smallestthree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value");
		a=s.nextInt();
		System.out.println("Enter the second value");
		b=s.nextInt();
		System.out.println("Enter the third value");
		c=s.nextInt();
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("A is small");
			}
			else
			{
				System.out.println("B is small");
			}
		}
		else if(b<c)
		{
			System.out.println("B is small");
		}
		else 
		{
			System.out.println("C is small");
		}
		s.close();
		

	}

}
