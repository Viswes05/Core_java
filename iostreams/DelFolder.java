package iostreams;
import java.util.Scanner;
import java.io.*;
public class DelFolder {

	public static void main(String[] args) throws FileNotFoundException{
		File x=new File("d:\\dataIO");
		x.delete();
	}

}
