package collection;

import java.util.Scanner;
import java.util.Stack;

public class Findinval {

	public static void main(String[] args) {
		Stack<Integer> data = new Stack<Integer>();
		int h=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the data: ");
			int a=s.nextInt();
			data.add(a);
		}
		System.out.println("Stack value is:  "+data);
		System.out.println("Enter the Finding value: ");
		int t=s.nextInt();
		System.out.println("Count is "+data.indexOf(t));
	}

}
