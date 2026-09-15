package whileloops;
import java.util.Scanner;
public class PosorNegorZero {

	public static void main(String[] args) {
		int a ;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		while(a!=1000)
		{
			if(a>0)
			{
				System.out.println(a+"is Pos number");
			}
			else if(a<0)
			{
				System.out.println(a+"is Neg number");
			}
			else
			{
				System.out.println(a+"Zero");
			}
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}
		s.close();
	}

}
