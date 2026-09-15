package iostreams;
import java.io.*;
import java.util.Scanner;
public class Readfile1 {

	public static void main(String[] args) throws FileNotFoundException {
		File x=new File( "d:\\file.txt");
		Scanner t=new Scanner(x);
		System.out.println(t.next());
		System.out.println(t.next());
		System.out.println(t.next());
		System.out.println(t.next());
		System.out.println(t.next());

	}

}
