package iostreams;
import java.io.*;
public class Ipstream {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("d:\\Output1.txt");
		int i=f.read();
		System.out.println((char)i);
		f.close();
	}

}
