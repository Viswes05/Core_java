package serialization;
import java.io.*;

class Child implements Serializable
{
	String stud_name;
	Child(String stud_name)
	{
		this.stud_name=stud_name;
	}
}

public class Stdrec2 extends Child implements Serializable {
	
	String stud_Addr;
	int stud_Id;
	public Stdrec2(String stud_name,String stud_Addr,int stud_Id)
	{
		super(stud_name);
		this.stud_Addr=stud_Addr;
		this.stud_Id=stud_Id;
	}
	
	public static void main(String[] args) {
		Stdrec2 s=new Stdrec2(" Adam ","Abc,Xyz",11);
		try
		{
			FileOutputStream fout=new FileOutputStream("s.txt");
			ObjectOutputStream out =new ObjectOutputStream(fout);
			out.writeObject(s);
			out.close();
			fout.close();
			System.out.println("Object Serialized and saved in s.text");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
