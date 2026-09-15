package forloops;
import java.util.Scanner;
public class Sumofn {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n numbers: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of n numbers is "+sum);
		s.close();
	}

}
