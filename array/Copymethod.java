package array;

import java.util.Arrays;
import java.util.Scanner;

public class Copymethod {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=s.nextInt();
		int a[]=new int[n];
		int data[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value");
			a[i]=s.nextInt();
		}
		System.arraycopy(a,0,data,0,a.length);
		System.out.println("Current array is : "+Arrays.toString(a));
		System.out.println("copy array is : "+Arrays.toString(data));
		s.close();
	}

}
