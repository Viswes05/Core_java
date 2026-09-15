package collection;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Topval {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			q.add(x);
		}
		System.out.println("Queue is "+q);
		int data=q.peek();
		System.out.println("Top value is: "+data);
	}

}
