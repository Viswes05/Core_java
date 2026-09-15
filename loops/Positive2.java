package loops;
import java.util.*;
public class Positive2 {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		if (a>0)
		{
			System.out.println("+ve");
		}
		else
		{
			System.out.println("-ve");
		}
		s.close();

	}

}
