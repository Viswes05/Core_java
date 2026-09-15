package forloops;
import java.util.Scanner;
public class Printingnumbers {

	public static void main(String[] args) {
		int start,end;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		start=s.nextInt();
		System.out.println("Enter the ending value: ");
		end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
		s.close();

	}

}
