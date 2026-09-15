package iostreams;
import java.io.*;
public class Opstream {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("d:\\Output1.txt");
		f.write(67);
		f.close();
	}

}
