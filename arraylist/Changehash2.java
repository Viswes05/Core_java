package arraylist;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Changehash2 {

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
		System.out.println("result is"+ a);
		System.out.println("Enter the particular value: ");
		int n=s.nextInt();
		a.remove(n);
		System.out.println("updated Result is: "+a);
		s.close();
	}

}
