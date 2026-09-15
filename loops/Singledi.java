package loops;
import java.util.*;
public class Singledi {

	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the value : ");
		x=s.nextInt();
		if (x>=0 == x<=9)
		{
			System.out.println("Single digit");
		}
		else
		{
			System.out.println("not a single digit");
		}
		s.close();	

	}

}
