package lambda;
import java.util.Scanner;
interface addable{
	int square(int a);
}
public class Lambsquare {

	public static void main(String[] args) {
		addable ad2=(int a)->{
			return (a*a);
		};
		int n,a,m=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n value");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the number: ");
			a=s.nextInt();
			int d=ad2.square(a);
			m=m+d;
		}
		System.out.println(m);
	}
}
