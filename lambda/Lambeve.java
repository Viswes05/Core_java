package lambda;
import java.util.Scanner;
interface oddoreven{
	int setValue(int a);
}
public class Lambeve {

	public static void main(String[] args) {
		oddoreven ad2=(int a)->{
			return (a*a*a);
		};
		int n,a;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n value");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the number: ");
			a=s.nextInt();
			int d=ad2.setValue(a);
			if(d%2==0)
			{
				System.out.println("Even Number: "+d);
			}
			else
			{
				System.out.println("Odd number: "+d);
			}
		}
	}
}
