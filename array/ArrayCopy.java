package array;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int a[]= new int [n];
		int b[]= new int [n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value: ");
			a[i]=s.nextInt();
		}System.out.println("Result is: ");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("ARRAY A IS :"+Arrays.toString(a));
		System.out.println("ARRAY B IS :"+Arrays.toString(b));
		s.close();
}

}
