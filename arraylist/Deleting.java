package arraylist;
import java.util.*;
public class Deleting {

	public static void main(String[] args) {
		Vector<Integer> x=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter the value: ");
			int m=s.nextInt();
			x.add(m);
			i++;
		}
		System.out.println("Vector value: "+x);
		System.out.println("Enter the particular value: ");
		int w=s.nextInt();
		for(int q=0;q<x.size();q++)
		{
			if(x.get(q)==w)
			{
				x.remove(q);
			}
		}
		System.out.println("Latest Vector Value: "+x);
		s.close();
	}

}
