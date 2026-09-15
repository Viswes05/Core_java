package array;
import java.util.Scanner;
import java.util.Arrays;
public class Copy {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value");
			a[i]=s.nextInt();
		}
		int data[]=a;
		System.out.println("Current array is : "+Arrays.toString(a));
		System.out.println("copy array is : "+Arrays.toString(data));
		s.close();

	}

}
