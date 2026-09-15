package arraylist;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class COutningenum {

	public static void main(String[] args) {
		Vector<Integer> x=new Vector<Integer>();
		Enumeration data;
		int h=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			Integer m=s.nextInt();
			x.add(m);
			i++;
		}
		data=x.elements();
		System.out.print("Enter the particular word: ");
		Integer m=s.nextInt();
		while(data.hasMoreElements())
		{
			if(data.nextElement()==m)
			{
				h=h+1;
			}
		}
		System.out.println("Count is "+h);
		s.close();
	}

}
