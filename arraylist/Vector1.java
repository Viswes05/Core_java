package arraylist;
import java.util.Scanner;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> x=new Vector <String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter teh value: ");
			String m=s.next();
			x.add(m);
			i++;
		}
		System.out.println("Vector is "+x);
		s.close();
	}

}
