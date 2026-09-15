package serialization;
import java.io.*;
public class Stdrec implements Serializable{

		public String Stud_name;
		public String Stud_Addr;
		public int Stud_id;
	public static void main(String[] args) {
		Stdrec s=new Stdrec();
		s.Stud_name="Sam Nikolus";
		s.Stud_Addr="Abc Xyz";
		s.Stud_id=1;
		try
		{
			FileOutputStream fout =new FileOutputStream("s.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s);
			out.close();
			fout.close();
			System.out.println("Object Serialized And saved in s.txt");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
	}

}
