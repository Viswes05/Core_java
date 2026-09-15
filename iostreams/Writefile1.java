package iostreams;
import java.io.*;
public class Writefile1 {

	public static void main(String[] args) throws IOException {
		FileWriter x=new FileWriter("d:\\dataIO.txt");
		x.write("Hello World");
		x.close();
	}

}
