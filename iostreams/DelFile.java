package iostreams;
import java.io.*;
import java.util.Scanner;
public class DelFile {

	public static void main(String[] args) throws FileNotFoundException {
		File x=new File("d:\\file.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		x.delete();
		System.out.println(t.next());
		
	}

}
