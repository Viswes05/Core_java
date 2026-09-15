package forloops;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int n,s=0;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter n numbers: ");
		n=k.nextInt();
		if(n>1)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					s=1;
				break;
				}
			}
		}
		if (s==1)
		{
			System.out.println("it is not a prime number");
		}
		else
		{
			System.out.println("It is a prime number");
		}
		k.close();
	}

}
