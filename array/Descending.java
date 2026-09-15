package array;
import java.util.Arrays;
import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		int n,t;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number : ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		System.out.println("ARRAY is: ");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
		}
		}
		System.out.println("Descending order is : ");
		System.out.println(Arrays.toString(a));
		s.close();

	}

}
