package whileloops;
import java.util.Scanner;
public class Value {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		while(a!=200)
		{
			System.out.println("The value is : "+a);
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}
		s.close();
		
	}

}
