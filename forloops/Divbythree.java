package forloops;
import java.util.Scanner;
public class Divbythree {

	public static void main(String[] args) {
		int a,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		a=s.nextInt();
		System.out.println("Enter the last number: ");
		n=s.nextInt();
		for (int i=a;i<=n;i++)
			if(i%3==0)	
				{
					System.out.println(i+"Divisible by 3");
				}
			else
			{
				System.out.println(i+"Not divisible by 3");
			}
		s.close();
	}

}
