package iostreams;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public class Writefile2 {

	public static void main(String[] args) throws IOException {
		File x=new File("d:\\dataIO.txt");
		if(x.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File not created");
		}
		FileWriter x1 =new FileWriter("d:\\dataIO.txt");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any Text: ");
		String v=s.nextLine();
		x1.write(v);
		x1.close();
	}

}
