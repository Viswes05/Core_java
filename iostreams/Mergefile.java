package iostreams;
import java.io.*;
import java.util.Scanner;
public class Mergefile {

	public static void main(String[] args) throws IOException {
		File x=new File("d:\\file.txt");
		File m=new File("d:\\text1.txt");
		FileWriter p=new FileWriter("d:\\merge.txt");
		Scanner t=new Scanner(x);
		while(t.hasNextLine())
		{
			p.write(String.valueOf(t.nextLine()));
			p.write("\n");
		}
		Scanner t1=new Scanner(m);
		while(t1.hasNextLine())
		{
			p.write(String.valueOf(t.nextLine()));
			p.write("\n");
		}
		System.out.println("Process Completed");
		p.close();

	}

}
