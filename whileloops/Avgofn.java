package whileloops;
import java.util.Scanner;
public class Avgofn {

	public static void main(String[] args) {
		int n,sum=0,x,c=0;
		float avg=0f;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N value: ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println("Enter the value: ");
			x=s.nextInt();
			sum=sum+x;
			c=c+1;
			i=i+1;
		}
		avg=sum/c;
		System.out.println("average of n number is: "+avg );
		s.close();
	}
	

}
