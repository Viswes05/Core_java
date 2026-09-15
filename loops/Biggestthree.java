package loops;
import java.util.*;
public class Biggestthree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value: ");
		a=s.nextInt();
		System.out.println("Enter the second value: ");
		b=s.nextInt();
		System.out.println("Enter the third value: ");
		c=s.nextInt();
		if (a>b == a>c)
		{
			System.out.println("A is big");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is big");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is big");
		}
		else 
		{
			System.out.println("All are equal");
		}
		s.close();
	}
}
