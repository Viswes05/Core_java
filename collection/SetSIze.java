package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetSIze {

	public static void main(String[] args) {
		Set<Integer> t=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n : ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value");
			int x=s.nextInt();
			t.add(x);
		}
		System.out.println("Hashset size is: "+ t.size());
	}

}
