package collection;

import java.util.*;

public class NaviSet {

	public static void main(String[] args) {
		NavigableSet<Integer> t=new TreeSet<>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the value :");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("Tree set is: "+ t);
		int start1 =t.first();
		System.out.println("First Number is "+ start1);
		int lastn =t.last();
		System.out.println("Last Number is "+ lastn);
		int number1 =t.pollFirst();
		System.out.println("Removed First Element :"+ number1);
		int number2 =t.pollLast();
		System.out.println("Removed Last Element :"+ number2);
	}

}
