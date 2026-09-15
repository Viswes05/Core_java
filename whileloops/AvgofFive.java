package whileloops;
import java.util.Scanner;
public class AvgofFive {

	public static void main(String[] args) {
		int a,b,c,d,e,n,sum;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N numbers: ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println("Enter the 1st value: ");
			a=s.nextInt();
			System.out.println("Enter the 2st value: ");
			b=s.nextInt();
			System.out.println("Enter the 3st value: ");
			c=s.nextInt();
			System.out.println("Enter the 4st value: ");
			d=s.nextInt();
			System.out.println("Enter the 5st value: ");
			e=s.nextInt();
			sum=a+b+c+d+e;
			avg=sum/n;
			System.out.println("Average of 5 value is: "+avg);
			i=i+1;
		}
		s.close();

	}

}
