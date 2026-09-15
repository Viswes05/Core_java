package exceptionhand;
import java.io.*;
public class FileNotfoundexp {

	public static void main(String[] args) {
		try
		{
			File file =new File("D://file123.txt");
			FileReader fr=new FileReader(file);
			System.out.println("File available");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist");
		}
	}

}
