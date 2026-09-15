package iostreams;
import java.io.*;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) throws IOException {
		int esum=0,osum=0;
		File x=new File("d:\\file.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%2==0)
			{
				System.out.println(r+"is even");
				esum=esum+r;
			}
			else
			{
				System.out.println(r+"is even");
				osum=osum+r;
			}
			FileWriter p=new FileWriter("d:\\even.txt");
			FileWriter q=new FileWriter("d:\\odd.txt");
			p.write(String.valueOf(esum));
			q.write(String.valueOf(osum));
			p.close();
			q.close();


		}
	}

}
