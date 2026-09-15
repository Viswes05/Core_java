package forloops;
import java.util.Scanner;
public class Numberpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the n value: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
		}
		s.close();	
	}

}
