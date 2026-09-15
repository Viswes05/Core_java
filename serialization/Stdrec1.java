package serialization;

import java.io.*;

public class Stdrec1 implements Serializable{
	public String Stud_name;
	public String Stud_Addr;
	public int Stud_id;

	public static void main(String[] args) {
		Stdrec1 s=new Stdrec1();
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
			System.out.printf("Object Serialized And saved in s.txt");
			FileInputStream fin =new FileInputStream("s.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			s=(Stdrec1) in.readObject();
			in.close();
			fin.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Student Class not Found ");
			c.printStackTrace();
			return;
		}
		System.out.println("\n Deserialized Student");
		System.out.println("Name : "+s.Stud_name);
		System.out.println("Address : "+s.Stud_Addr);
		System.out.println("Number : "+s.Stud_id);
	}

}
