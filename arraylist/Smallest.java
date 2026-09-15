package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the value: ");
			t=s.nextInt();
			data.add(t);
		}
		int a=data.get(0);
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)<a)
			{
				a=data.get(i);
			}
		}
		System.out.println("Smallest value is "+a);
		s.close();
	}

}
