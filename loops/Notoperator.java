package loops;
import java.util.*;
public class Notoperator {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value: ");
		a=s.nextInt();
		if(!(a%2==0))
		{
			System.out.print("Odd");
		}
		else
		{
			System.out.print("Even");
		}
		s.close();
		

	}

}
