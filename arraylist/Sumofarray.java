package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Sumofarray {

	public static void main(String[] args) {
		int x,t,sum=0;
		ArrayList<Integer> data=new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n number; ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			t=s.nextInt();
			data.add(t);
		}
		for(int i=0;i<data.size();i++)
		{
			sum=sum+data.get(i);
		}
		System.out.println("Sum of all element is "+sum);
		s.close();
	}

}
