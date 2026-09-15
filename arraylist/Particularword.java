package arraylist;
import java.util.*;
public class Particularword {

	public static void main(String[] args) {
		int x;
		String t;
		ArrayList<String>data=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		x=s.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the word: ");
			t=s.next();
			data.add(t);
		}
		System.out.println("List is "+data);
		System.out.println("Enter the particular word: ");
		String a=s.next();
		for(int i=0;i<data.size();i++)
		{
			if(a.equals(data.get(i)))
			{
				System.out.println(data.get(i)+" is Available");
			}
			else
			{
				System.out.println(data.get(i)+" is not available");
			}
				
		}
		s.close();
	}

}
