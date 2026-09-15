package forloops;
import java.util.*;
public class Average {

	public static void main(String[] args) {
			int a,b,c,d,e,n,sum;
			float avg;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter N numbers: ");
			n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter 1 numbers: ");
				a=s.nextInt();
				System.out.println("Enter 2 numbers: ");
				b=s.nextInt();
				System.out.println("Enter 3 numbers: ");
				c=s.nextInt();
				System.out.println("Enter 4 numbers: ");
				d=s.nextInt();
				System.out.println("Enter 5 numbers: ");
				e=s.nextInt();
				sum=a+b+c+d+e;
				avg=sum/n;
				System.out.println("Average of 5 value is "+avg);
			}
			s.close();

	}

}
