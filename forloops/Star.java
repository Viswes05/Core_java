package forloops;
import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter the n value: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		s.close();

	}

}
