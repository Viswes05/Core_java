package iostreams;
import java.io.*;
import java.util.Scanner;
public class SumofN {

	public static void main(String[] args) throws IOException {
		int n=0;
		File x=new File("d:\\file.txt");
		File m=new File("d:\\sum.txt");
		FileWriter p=new FileWriter("d:\\sum.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			n=n+t.nextInt();
		}
		System.out.println(n);
		p.write(String.valueOf(n));
		p.close();
	}

}
