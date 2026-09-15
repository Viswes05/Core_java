package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Countingwords {

	public static void main(String[] args) {
		int x,g=0;
		String t;
		ArrayList<String>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the word: ");
			t=s.next();
			data.add(t);
		}
		System.out.println("List is "+data);
		System.out.println("Enter the particular word: ");
		String a=s.next();
		for(int i=0;i<data.size();i++)
		{
			if(a.equals(data.get(i)))
			{
				g=g+1;
			}		
		}
		System.out.println("Count is "+g);
		s.close();
	}

}
