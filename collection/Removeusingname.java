package collection;

import java.util.Scanner;
import java.util.Stack;

public class Removeusingname {

	public static void main(String[] args) {
		Stack<Integer> file =new Stack<Integer>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n : ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data: ");
			int a=s.nextInt();
			file.push(a);
		}
		System.out.println("Stack value is: "+file);
		file.removeAll(file);
		System.out.println("Stack is "+file);
	}

}
