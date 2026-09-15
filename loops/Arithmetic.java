package loops;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		int k;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any char: ");
		k=s.next().charAt(0);
		if (k=='+'|| k=='-'|| k=='*'|| k=='/'|| k=='%')
		{
			System.out.println("Arithmetic op");
		}
		else
		{
			System.out.println("not arithmetic Op");
		}
		s.close();

	}

}
