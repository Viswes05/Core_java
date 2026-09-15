package array;
import java.util.Scanner;
import java.util.Arrays;
public class Copyrange {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number :");
		n=s.nextInt();
		int a[]=new int[n];
		int data[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			a[i]=s.nextInt();
		}
		data=Arrays.copyOfRange(a,1,4);
		System.out.println("Current Array is: "+Arrays.toString(a));
		System.out.println("Copy arrays is : "+Arrays.toString(data));
		s.close();
		
	}

}
