package loops;
import java.util.*;
public class Posorneg {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		if(a>=0)
		{
			if(a==0)
			{
				System.out.println("Zero");
			}
			else
			{
				System.out.println("Positive");
			}
		}
		else
		{
			System.out.println("Negative");
		}
		s.close();

	}

}
