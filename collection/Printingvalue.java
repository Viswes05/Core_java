package collection;

import java.util.*;
import java.util.Set;

public class Printingvalue {

	public static void main(String[] args) {
		Set<Integer> t=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value: ");
			int x=s.nextInt();
			t.add(x);
		}
		Iterator<Integer> it = t.iterator();
		System.out.print("HashSet using Iterator: ");
		while(it.hasNext())
		{
			System.out.print(it.next());
			System.out.print(", ");
		}
	}

}
