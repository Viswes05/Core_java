package arraylist;

import java.util.Scanner;
import java.util.Vector;
public class Changingval {

	public static void main(String[] args) {
		Vector<Integer> x=new Vector <Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter teh value: ");
			int m=s.nextInt();
			x.add(m);
			i++;
		}
		System.out.println("Vector value "+x);
		System.out.println("Enter the particular value: ");
		int w=s.nextInt();
		System.out.println("Enter the updating value: ");
		int t=s.nextInt();
		for(int q=0;q<x.size();q++)
		{
			if(x.get(q)==w)
			{
				x.set(q, t);
			}
		}
		System.out.println("Updated vector value: "+x);
		
		s.close();
	}

}
