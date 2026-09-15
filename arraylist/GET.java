package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class GET {

	public static void main(String[] args) {
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n number: ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			t=s.nextInt();
			data.add(t);
		}
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		s.close();
		
	}

}
