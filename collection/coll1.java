package collection;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class coll1 {

	public static void main(String[] args) {
		LinkedList<Integer> q= new LinkedList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			q.add(i);
		}
		System.out.println("Queue is : "+q);
	}

}
