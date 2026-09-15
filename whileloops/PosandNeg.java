package whileloops;
import java.util.Scanner;
public class PosandNeg {

	public static void main(String[] args) {
		int a,x=0,y=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		do
		{
			if(a>0)
			{
				x=x+a;
			}
			else
			{
				y=y-a;
			}
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}while(a!=1000);
			System.out.println("Positive sum is "+x);
			System.out.println("Negative  sum is "+-(y));
			s.close();

	}

}
