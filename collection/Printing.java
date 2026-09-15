package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		LinkedList<Integer>data=new LinkedList<Integer>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter the value: ");
			int m=s.nextInt();
			data.add(m);
			i++;
		}
		System.out.println("Linked List is : "+data);
		s.close();
	}
	

}
