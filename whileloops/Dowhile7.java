package whileloops;
import java.util.Scanner;
public class Dowhile7 {

	public static void main(String[] args) {
		int a,x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		do
		{
			x=a*a;
			System.out.println("The square value is: "+x);
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}while(a!=500);
		s.close();

	}

}
