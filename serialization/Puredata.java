package serialization;
import java.io.*;
public class Puredata {

	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("Data.txt");
		DataOutputStream d=new DataOutputStream(f);
		d.writeUTF("Java programming");
		FileInputStream f1=new FileInputStream("data.txt");
		DataInputStream d1=new DataInputStream(f1);
		System.out.println(d1.readUTF());
		
		
	}

}
