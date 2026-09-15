package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Onparticularvalue4 {

	public static void main(String[] args) {
		LinkedList<Integer> data=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data: ");
			int a=s.nextInt();
			data.add(a);
		}
		System.out.println("Stack value is: "+data);
		System.out.println("Enter the deleting value: ");
		int t=s.nextInt();
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)==t)
			{
				data.remove(i);
			}
		}
		System.out.println("Linked List is "+data);
		s.close();
	}

}
