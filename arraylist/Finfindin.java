package arraylist;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Finfindin {

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
		System.out.print("Enter the particular word: ");
		String m=s.next();
		while(data.hasMoreElements())
		{
			if(m.equals(data.nextElement()))
			{
				System.out.println("Available ");
			}
		}
		s.close();
	}

}
