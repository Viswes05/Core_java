package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset {

	public static void main(String[] args) {
		Set<Integer> t= new HashSet<Integer>();
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			t.add(x);
		}
		Set<Integer> p =new HashSet<Integer>();
		System.out.println("Enter the n: ");
		int a=s.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			p.add(x);
		}
		System.out.println("Hashset 1 is "+ t);
		System.out.println("Hashset 2 is "+ p);
		boolean result = t.containsAll(p);
		if(result)
		{
			System.out.println("Set 2 is Subset of set1");
		}
		else
		{
			System.out.println("Set2 is not subset of set1 ");
		}
	}
}
