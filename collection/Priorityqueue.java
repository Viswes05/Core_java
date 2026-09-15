package collection;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> r=new PriorityQueue<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		while(d!=1000)
		{
			r.add(d);
			System.out.println("Enter th value: ");
			d=s.nextInt();
			
		}
		System.out.println("queue is "+r);
		System.out.println("Top value is "+r.peek());
		System.out.println("Deleted value is "+r.remove());
		System.out.println("Updated queue is "+r);
	
	
	}
	

}
