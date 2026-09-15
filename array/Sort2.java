package array;
import java.util.Scanner;
import java.util.Arrays;
public class Sort2 {

	public static void main(String[] args) {
		int n;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Array is: ");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array sort is: ");
		System.out.println(Arrays.toString(a));
		s.close();
	}

}
