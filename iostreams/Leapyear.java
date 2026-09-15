package iostreams;
import java.io.*;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) throws FileNotFoundException {
		int n=0;
		File x=new File("d:\\file.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%4==0)
			{
				System.out.println(r+ "Is Leap Year");
			}
			else
			{
				System.out.println(r+ "Is not Leap Year");
			}
		}
	}

}
