package arraylist;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ChangeLink {

	public static void main(String[] args) {
		int x,key;
		LinkedHashMap <Integer,String> a= new LinkedHashMap<Integer,String>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n : ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the key: ");
			key=s.nextInt();
			System.out.println("Enter the value: ");
			String value =s.next();
			a.put(key, value);
		}
		System.out.println("Result is "+ a);
		System.out.println("Enter the particular value: ");
		int n=s.nextInt();
		System.out.println("Enter the change value: ");
		String k=s.next();
		a.put(n, k);
		System.out.println("Updated Result is "+ a);
		s.close();
	}

}
