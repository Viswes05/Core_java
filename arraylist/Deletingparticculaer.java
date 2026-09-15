package arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class Deletingparticculaer {

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
		System.out.println("Array list is: "+data);
		System.out.println("Enter the Address: ");
		int b=s.nextInt();
		data.remove(b);
		System.out.println("Current array list is: "+data);
		s.close();
	}

}
