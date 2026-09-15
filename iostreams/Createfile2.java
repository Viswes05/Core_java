package iostreams;
import java.io.*;
public class Createfile2 {

	public static void main(String[] args) throws IOException {
		File x=new File("d:\\dataIO.txt");
		if(x.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File Not Created");
		}
	}

}
