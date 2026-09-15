package serialization;
import java.io.*;
public class Statics implements Serializable {
	static int x=50;
	public static void main(String[] args) {
		Statics o=new Statics();
		System.out.println("Serialization Succesfull , Static Number value: "+x);
		try
		{
			FileOutputStream f=new FileOutputStream("s.txt");
			ObjectOutputStream ob=new ObjectOutputStream(f);
			ob.writeObject(o);
			ob.close();
			x=48;
			FileInputStream fi=new FileInputStream("s.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			o=(Statics) oi.readObject();
			oi.close();
			System.out.println("After Deserialization , Static Number value: "+x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
