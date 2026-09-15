package arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,t;
		ArrayList<Integer> data=new ArrayList<>();
		System.out.println("Enter the n: ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			t=s.nextInt();
			data.add(t);
		}
		System.out.println("Array list: "+data);
		s.close();
		
		
	}

}
