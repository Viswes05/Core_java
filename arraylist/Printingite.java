package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Printingite {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		ArrayList<Integer> data =new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			int a=s.nextInt();
			data.add(a);
		}
		System.out.println(data);
		Iterator itr = data.iterator();
		System.out.println("Values are : ");
		while(itr.hasNext())
		{
			itr.forEachRemaining((value) -> System.out.print(value + ", "));
		}
		s.close();
	}

}
