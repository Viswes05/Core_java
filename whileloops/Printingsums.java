package whileloops;
import java.util.Scanner;
public class Printingsums {

	public static void main(String[] args) {
		int n,sum = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N num ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println("Sum of n numbers is: "+sum);
		s.close();

	}

}
