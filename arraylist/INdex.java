package arraylist;

import java.util.Scanner;
import java.util.Vector;
public class INdex {

	public static void main(String[] args) {
		Vector<Integer> x=new Vector <Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter the value: ");
			int m=s.nextInt();
			x.add(m);
			i++;
		}
		System.out.println("Vector value: "+x);
		System.out.println("Enter the particular value: ");
		int w=s.nextInt();
		for(int q=0;q<x.size();q++)
		{
			if(x.get(q)==w)
			{
				System.out.println("Index is "+q);
			}
		}
		s.close();
	}

}
