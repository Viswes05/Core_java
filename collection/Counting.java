package collection;

import java.util.Scanner;
import java.util.Stack;

public class Counting {

	public static void main(String[] args) {
		Stack<Integer> data = new Stack<Integer>();
		int h=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter the data: ");
			int a=s.nextInt();
			data.push(a);
		}
		System.out.println("Stack value is :"+data);
		System.out.println("Enter the Finding value: ");
		int t=s.nextInt();
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)==t)
			{
				h++;
			}
		}
		System.out.println("Count is "+h);
	}

}
