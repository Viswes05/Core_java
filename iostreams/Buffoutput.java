package iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffoutput {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("d:\\output1.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		String s="Java Programming";
		byte c[]=s.getBytes();
		b.write(c);
		b.flush();
		b.close();
		f.close();
	}

}
