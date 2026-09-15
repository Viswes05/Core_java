package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int x,t,g=0;
		ArrayList<Integer>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number :");
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
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)==a)
			{
				g=g+1;
			}
		}
		System.out.println("count is"+g);
		s.close();
	
	
	
	}
	

}
