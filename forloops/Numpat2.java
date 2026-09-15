package forloops;
import java.util.Scanner;
public class Numpat2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the n value: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			System.out.print(j);
			}
			System.out.print("\n");
		}
		s.close();

	}

}
