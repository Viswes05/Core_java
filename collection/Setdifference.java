package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Setdifference {

	public static void main(String[] args) {
		Set<Integer> t=new HashSet<Integer>();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("HashSet1 is"+ t);
		Set<Integer> p=new HashSet<Integer>();
		System.out.println("Enter the n: ");
		int a=s.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			p.add(x);
		}
		System.out.println("HashSet 2 is "+ p);
		t.removeAll(p);
		System.out.println("Difference of 2 is "+ t);
	}

}
