package collection;

import java.util.Scanner;
import java.util.Stack;

public class PRintinvalu {

	public static void main(String[] args) {
		Stack<String> value = new Stack<String>();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value: ");
			String a=s.next();
			value.push(a);
		}
		System.out.println(value);
		s.close();
	}

}
