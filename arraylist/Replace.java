package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		int x,t;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n number: ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the value: ");
			t=s.nextInt();
			data.add(t);
		}
		System.out.println("List is "+data);
		System.out.println("Enter the value: ");
		int a=s.nextInt();
		System.out.println("Enter the latest value: ");
		int b=s.nextInt();
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)==a)
			{
				data.set(i,b);
			}
		}
		System.out.println("updated list is "+data);
		s.close();
	}

}
