package collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Staccollec {

	public static void main(String[] args) {
		Stack value = new Stack();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			int a=s.nextInt();
			value.push(a);
		}
		String b="Systech";
		value.push(b);
		System.out.print(value);
	}

}
