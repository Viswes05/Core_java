package whileloops;
import java.util.Scanner;
public class Star8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the n value: ");
		n=s.nextInt();
		i=1;
		while(i<n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
		}
		i=n;
		while(i>0)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i--;
		}
		s.close();

	}

}
