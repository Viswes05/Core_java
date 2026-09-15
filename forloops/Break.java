package forloops;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		int start,end,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start Value: ");
		start=s.nextInt();
		System.out.println("Enter the end value: ");
		end=s.nextInt();
		System.out.println("Searching the Key:");
		k=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i==k)
			{
				break;
			}
			System.out.println(i);
		}
		s.close();

	}

}
