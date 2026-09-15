package iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile2 {

	public static void main(String[] args) throws FileNotFoundException  {
		File x=new File( "d:\\file.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
	}

}
