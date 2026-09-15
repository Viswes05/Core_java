package iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreEvenOdd {

	public static void main(String[] args) throws IOException {
		File x=new File("d:\\file.txt");
		FileWriter p=new FileWriter("d:\\even.txt");
		FileWriter q=new FileWriter("d:\\odd.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%2==0)
			{
				System.out.println(r+"is even");
				p.write(String.valueOf(r));
				p.write("\n");
			}
			else
			{
				System.out.println(r+"is Odd");
				q.write(String.valueOf(r));
				q.write("\n");
			}
		}	
			p.close();
			q.close();
	}

}
