package iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile4 {

	public static void main(String[] args)
	{
		try
		{
		File x=new File( "d:\\file1.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			String data=t.next();
			System.out.println(data);
		}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error");
		}
	}

}
