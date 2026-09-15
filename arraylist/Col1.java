package arraylist;

import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Collection;

public class Col1 {

	public static void main(String[] args) {
		Vector<String> x=new Vector<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		System.out.println("Vector is : ");
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter the value: ");
			String m=s.next();
			x.add(m);
			i++;
		}
		System.out.println("Collection Arraylist ");
		Collection c=new ArrayList <Integer>();
		for(int j=0;j<d;j++)
		{
			System.out.println("Enter the value: ");
			int t=s.nextInt();
			c.add(t);
		}
		System.out.println("Vector value is: "+x);
		System.out.println("Collection arraylist "+c);
		x.addAll(c);
		System.out.println("Final vector is "+x);
		s.close();
	}

}
