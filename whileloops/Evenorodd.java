package whileloops;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		int start,end;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		start=s.nextInt();
		System.out.println("Enter the ending number: ");
		end=s.nextInt();
		while(start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start+"is Even number");
			}
			else
			{
				System.out.println(start+"is Odd number");
			}
			start=start+1;
		}
		s.close();
	}

}
