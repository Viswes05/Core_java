package forloops;
import java.util.Scanner;
public class Continousnumbers {

	public static void main(String[] args) {
		int start,end,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		start=s.nextInt();
		System.out.println("Enter the Ending value: ");
		end=s.nextInt();
		System.out.println("Searching Number: ");
		k=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i==k)
			{
				continue;
			}
			System.out.println(i);
		}
		s.close();
		

	}

}
