package array;
import java.util.Scanner;
import java.util.Arrays;
public class Particular {

	public static void main(String[] args) {
		int n,t,c=0;
		int a[]=new int[7];
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("Array is:");
		System.out.println(Arrays.toString(a));
		System.out.println("Enter Finding number: ");
		t=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==t) {
				c++;
			}
		}
		System.out.println("Number count is:"+c);
		s.close();
	}

}
