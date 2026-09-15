package iostreams;
import java.io.*;
public class Print {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("d:\\text1.txt");
		PrintStream p=new PrintStream(f);
		p.print(2016);
		p.print(" Welcome");
		f.close();
		p.close();
	}

}
