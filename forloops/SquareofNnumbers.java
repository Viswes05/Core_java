package forloops;
import java.util.Scanner;
public class SquareofNnumbers {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number: ");
		n=s.nextInt();
		for (int i=1;i<=n;i++)
		{
			sum=sum+i*i;
		}
		System.out.println("Square of n numbers is "+sum);
		s.close();

	}

}
