package collection;

import java.util.Scanner;
import java.util.Stack;

public class Searching {

	public static void main(String[] args) {
		Stack<Integer> data =new Stack<Integer>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n : ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data: ");
			int a=s.nextInt();
			data.push(a);
		}
		System.out.println("Stack value is: "+data);
		System.out.println("Enter the Searching value: ");
		int t=s.nextInt();
		int k=data.search(t);
		if(k>0)
		{
			System.out.println("Available");
		}		
		else
		{
			System.out.println("Not available");
		}

	}

}
