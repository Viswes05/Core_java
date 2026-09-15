package arraylist;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Linkedhash {

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
		for(Integer key1 : a.keySet())
		{
			System.out.println(key1+" "+a.get(key1));
		}
		s.close();
	}

}
