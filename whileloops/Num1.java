package whileloops;
import java.util.Scanner;
public class Num1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the n value : ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print(i);
			i++;
		}
		s.close();

	}

}
