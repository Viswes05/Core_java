package collection;

import java.util.*;

public class sortseet {

	public static void main(String[] args) {
		SortedSet<Integer> t=new TreeSet<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("Treeset is "+t);
		int start1 =t.first();
		System.out.println("First  Number is: " +start1);
		int lastn =t.last();
		System.out.println("Last Number is: "+lastn);
	}

}
