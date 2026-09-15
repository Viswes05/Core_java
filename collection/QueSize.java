package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueSize {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int d=s.nextInt();
		while(d!=1000)
		{
			q.add(d);
			System.out.println("Enter the value:  ");
			d=s.nextInt();
		}
		System.out.println("Queue is "+q);
		System.out.println("Size of queue is"+q.size());
		
	}

}
