package loops;
import java.util.*;
public class Printingzero {

	public static void main(String[] args) {
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		c=s.nextInt();
		if (!(c==0))
		{
			System.out.println("Not zero");
		}
		else
		{
			System.out.print("Zero");
		}
		s.close();
	}

}
