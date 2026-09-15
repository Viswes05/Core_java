package iostreams;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Buffinput {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("d:\\output1.txt");
		BufferedInputStream b=new BufferedInputStream(f);
		int i;
		while((i=b.read())!=-1)
		{
			System.out.println((char)i);
		}
		b.close();
		f.close();
	}

}
