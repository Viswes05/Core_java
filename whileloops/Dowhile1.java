package whileloops;
import java.util.Scanner;
public class Dowhile1 {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number: ");
		n=s.nextInt();
		int i=1;
		do
		{
			sum=sum+i;
			i=i+1;
		}
		while(i<=n);
		System.out.println("Sum of the n number is: "+sum);
		s.close();
	}
	

}
