package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Ite1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=s.nextInt();
		ArrayList<Integer> data =new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			int a=s.nextInt();
			data.add(a);
		}
		System.out.println(data);
		Iterator itr = data.iterator();
		while(itr.hasNext())
		{
			int i=(int) itr.next();
			System.out.println(i);
		}
		s.close();
			
	}

}
