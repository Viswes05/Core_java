package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class Revget {

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
		for(int i=data.size()-1;i>=0;i--)
		{
			System.out.println(data.get(i));
		}
		s.close();
		
	}

}
