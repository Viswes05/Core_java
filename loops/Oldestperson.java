package loops;
import java.util.Scanner;
public class Oldestperson {

	public static void main(String[] args) {
		int first,second,third;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first person: ");
		first=s.nextInt();
		System.out.println("Enter the second person: ");
		second=s.nextInt();
		System.out.println("Enter the third person: ");
		third=s.nextInt();
		if(first>second && first>third)
		{
			System.out.println("First person is the oldest person");
		}
		else if(second>first && second>third)
		{
			System.out.println("second person is the oldest person");
		}
		else if(third>first && third>second)
		{
			System.out.println("third person is the oldest person");
		}
		else 
		{
			System.out.println("All are equal");
		}
		s.close();

	}

}
