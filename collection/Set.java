package collection;

import java.util.HashSet;
import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> t=new HashSet<Integer>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the value: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("HashSet is "+ t);
	}

}
