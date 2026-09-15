package arraylist;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Scanner;

public class Enum {

	public static void main(String[] args) {
		Vector<String> x=new Vector<String>();
		Enumeration data;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			String m=s.next();
			x.add(m);
			i++;
		}
		data=x.elements();
		System.out.print("Value is: ");
		while(data.hasMoreElements())
		{
			System.out.print(data.nextElement()+" ");
		}
		s.close();
	}

}
