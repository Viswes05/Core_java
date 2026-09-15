package whileloops;
import java.util.Scanner;
public class Sumodsq {

	public static void main(String[] args) {
		int n,sum=0,x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int i=1;
		do
		{
			x=i*i;
			sum=sum+x;
			i=i+1;
		}while(n!=1000);
		System.out.println("Sum of Square is: "+sum);
		s.close();
	}
	

}
