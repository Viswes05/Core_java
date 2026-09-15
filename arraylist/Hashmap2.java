package arraylist;
import java.util.HashMap;
import java.util.Scanner;
public class Hashmap2 {

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
		System.out.println("Result is "+ a);
		s.close();
	}

}
