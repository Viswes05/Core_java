package array;
import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n,sum=0;
		float avg;
		int a[]=new int[5];
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Arrays is: ");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array is: "+sum);
		avg=sum/n;
		System.out.println(" Average of array is: "+avg);
		s.close();

	}

}
