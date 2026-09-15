package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Onparticularvalue2 {

	public static void main(String[] args) {
		int h=0;
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
		System.out.println("Enter the Finding value: ");
		int t=s.nextInt();
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)==t)
			{
				h++;
			}
		}
		System.out.println("Count is "+h);
		s.close();
	}

}
