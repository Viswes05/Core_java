package iostreams;
import java.io.*;
public class Createfile1 {

	public static void main(String[] args) throws IOException {
		File x=new File("abc.txt");
		if(x.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File not Created");
		}
	}

}
