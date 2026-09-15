package arraylist;
import java.util.*;
public class Eachloop {

	public static void main(String[] args) {
		Vector<Integer> x=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n: ");
		int d=s.nextInt();
		int i=1;
		while(i<=d)
		{
			System.out.println("Enter the value: ");
			Integer m=s.nextInt();
			x.add(m);
			i++;
		}
		System.out.println("Enter the value: ");
		for(int q: x)
		{
			System.out.println(q+" ");
		}
		s.close();
	}

}
