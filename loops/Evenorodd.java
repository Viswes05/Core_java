package loops;
import java.util.*;
public class Evenorodd {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("Entert the value: ");
		a=s.nextInt();
		if (a%2==0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.print("Odd");
		}
		s.close();

	}

}
