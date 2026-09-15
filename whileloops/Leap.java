package whileloops;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		int x,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println("Enter the year");
			x=s.nextInt();
			if(x%4==0)
			{
				System.out.println(x+"Is Leap Year");
			}
			else
			{
				System.out.println(x+"is Not a Leap year");
			}
			i=i+1;
			
		}
		s.close();
		

	}

}
