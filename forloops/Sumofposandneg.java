package forloops;
import java.util.Scanner;
public class Sumofposandneg {

	public static void main(String[] args) {
		int ps=0,ns=0,n,a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number: ");
		n=s.nextInt();
		for (int i=1;i<=n;i++)
		{
			System.out.println("Enter the value: ");
			a=s.nextInt();
			if(a>0)
			{
				ps=ps+a;
			}
			else
			{
				ns=ns-a;
			}
		}
		System.out.println("Positive sum is "+ps);
		System.out.println("Negative sum is "+-(ns));
		s.close();
	}

}
