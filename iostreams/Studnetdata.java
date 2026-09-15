package iostreams;
import java.io.*;
import java.util.Scanner;
public class Studnetdata {

	public static void main(String[] args) throws IOException {
		File x=new File("d:\\Studetndata.txt");
		FileWriter p=new FileWriter("d:\\Studetndata.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Student name: ");
			String name =s.next();
			System.out.println("Enter the 1st Subject Mark: ");
			int m1=s.nextInt();
			System.out.println("Enter the 2st Subject Mark: ");
			int m2=s.nextInt();
			System.out.println("Enter the 3st Subject Mark: ");
			int m3=s.nextInt();
			int total=m1+m2+m3;
			System.out.println("Hi "+name+" Your mark is "+total);
			p.write(String.valueOf(name));
			p.write("\t");
			p.write(String.valueOf(total));
			p.write("\n");
			
		}
		p.close();
			
	}

}
