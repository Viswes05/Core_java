package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> data = new LinkedList<String>();
		data.add("java");
		data.add("Program");
		data.add("oops");
		data.add("Classes");
		Iterator<String> itr=data.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
