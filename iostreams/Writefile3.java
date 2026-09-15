package iostreams;
import java.io.*;
import java.util.Scanner;
public class Writefile3 {

	public static void main(String[] args) throws IOException {
		File x=new File("d:\\file.txt");
		if(x.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File not Created");
		}
		FileWriter x1 = new FileWriter("d:\\file.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Any Text: ");
			String v=s.next();
			x1.write(v);
			x1.write("\n");
		}
		x1.close();
	}

}
