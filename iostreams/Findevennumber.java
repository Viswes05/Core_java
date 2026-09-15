package iostreams;
import java.io.*;
import java.util.Scanner;
public class Findevennumber {

	public static void main(String[] args) throws FileNotFoundException  {
		int n=0;
		File x=new File("d:\\file.txt");
		Scanner t=new Scanner(x);
		while(t.hasNext())
		{
			int r=t.nextInt();
			if(r%2==0)
			{
				System.out.println(r+ "is Even");
			}
			else
			{
				System.out.println(r+ "Is not Even");
			}
		}
		
	}

}
