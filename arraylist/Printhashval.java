package arraylist;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Printhashval {

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
		for(Map.Entry<Integer, String> mapElement : a.entrySet())
		{
			Integer key2 = mapElement.getKey();
			String value = mapElement.getValue();
			System.out.println(key2+" : "+ value);
		
		}
		s.close();
	}

}
