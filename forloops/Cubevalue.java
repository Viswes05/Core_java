package forloops;
import java.util.Scanner;
public class Cubevalue {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n numbers: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i*i;
		}
		System.out.println("Square of n number is "+sum);
		s.close();
	}
	

}
