package arraylist;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap4 {

	public static void main(String[] args) {
		int x,key;
		HashMap<Integer,String> a=new HashMap<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number : ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the key: ");
			key=s.nextInt();
			System.out.println("Enter the String: ");
			String value=s.next();
			a.put(key, value);
		}
		System.out.println("Enter the particular key value: ");
		int n=s.nextInt();
		
		for(Integer key1 : a.keySet())
		{
			if(key1==n)
			{
				System.out.println(a.get(key1)+" is available");
		
			}
		}
		s.close();
	}

}
