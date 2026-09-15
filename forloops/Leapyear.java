package forloops;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		int start,end;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting year");
		start=s.nextInt();
		System.out.println("Enter Ending year");
		end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%4==0)
			{
				System.out.println(i+"Leap year");
			}
			else
			{
				System.out.println(i+"Not leap year");
			}
		}
		s.close();
		

	}

}
